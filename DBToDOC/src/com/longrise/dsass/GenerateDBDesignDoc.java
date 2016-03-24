package com.longrise.dsass;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import com.longrise.dsass.hib.HibernateSessionFactory;
import com.longrise.dsass.hib.bo.Leapcodetype;
import com.longrise.dsass.hib.bo.Leapcodevalue;
import com.longrise.dsass.hib.bo.Leapdatafield;
import com.longrise.dsass.hib.bo.Leaptable;
import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.rtf.RtfWriter2;
import com.lowagie.text.rtf.field.RtfPageNumber;
import com.lowagie.text.rtf.field.RtfTotalPageNumber;
import com.lowagie.text.rtf.headerfooter.RtfHeaderFooter;
import com.lowagie.text.rtf.style.RtfFont;
import com.lowagie.text.rtf.style.RtfParagraphStyle;

public class GenerateDBDesignDoc{
	public static Map<Integer, String>	dataType	= new HashMap<Integer, String>();

	public static void putSQLDataType(){
		dataType.put(12, "nvarchar");
		dataType.put(4, "int");
		dataType.put(93, "datetime");
		dataType.put(91, "date");
		dataType.put(3, "decimal");
		dataType.put(2004, "image");
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String [] args) throws Exception{
		putSQLDataType();
		createDoc();
	}

	@SuppressWarnings("unchecked")
	public static String getCodeTypes(Session session, String codetypename){
		String hql = "from Leapcodetype where codetypename = :codetypename";
		Query query = session.createQuery(hql);
		query.setString("codetypename", codetypename);
		Leapcodetype type = (Leapcodetype) query.uniqueResult();
		String ret = null;
		if(type != null){
			String vhql = "from Leapcodevalue where codetypename = :codetypename";
			query = session.createQuery(vhql);
			query.setString("codetypename", codetypename);
			List<Leapcodevalue> list = query.list();
			if(list != null && list.size() > 0){
				Collections.sort(list);
				ret = "（" + type.getCodetablecnname() + "）" + type.getCodetypeenname() + "\n";
				for(Leapcodevalue c: list){
					ret += "\t" + c.getCodeid() + "、" + c.getCodevalue() + "\n";
				}
				ret = ret.substring(0, ret.length() - 1) + "\n";
			}
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	public static String createDoc() throws Exception{
		String path = "doc/";
		File file = new File(path);
		if(!file.exists()){
			file.mkdirs();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMDDHHmmss");
		String docName = "dsass" + sdf.format(new Date()) + ".doc";
		path = path + "" + docName;
		// 创建word文档,并设置纸张的大小
		Document document = new Document(PageSize.A4, 72, 72, 72, 72);
		RtfWriter2.getInstance(document, new FileOutputStream(path));
		document.open();
		Paragraph ph = new Paragraph();
		Font f = new Font();
		Paragraph p = new Paragraph("深圳市残疾人社会保障与服务信息系统", new Font(Font.NORMAL, 18, Font.BOLD, new Color(0, 0, 0)));
		p.setAlignment(1);
		document.add(p);
		ph.setFont(f);
		// 设置中文字体
		BaseFont bfFont = BaseFont.createFont("C:\\Windows\\Fonts\\msyh.ttc,1", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
		// BaseFont bfFont =
		// BaseFont.createFont("微软雅黑","UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);
		// Font chinaFont = new Font();
		/* * 创建有三列的表格 */
		Paragraph parafooter = new Paragraph();
		Font footerFont = new RtfFont("微软雅黑", 12, Font.BOLD, Color.BLACK);
		parafooter.setFont(new Font(footerFont));
		parafooter.add(new Phrase("第"));
		parafooter.add(new RtfPageNumber());
		parafooter.add(new Phrase("页  共"));
		parafooter.add(new RtfTotalPageNumber());
		parafooter.add(new Phrase("页"));
		HeaderFooter footer = new RtfHeaderFooter(parafooter);
		footer.setAlignment(Element.ALIGN_CENTER);
		footer.setBorder(Rectangle.NO_BORDER);
		document.setFooter(footer);
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "from Leaptable where name like 'dsass%' order by name";
		Query query = session.createQuery(hql);
		List<Leaptable> list = query.list();
		List<Leapdatafield> dlist = null;
		Table table = null;
		Cell cell = null;
		Font chapterFont = new Font(bfFont, 16, Font.BOLD, new Color(0, 0, 0));
		Font sectionFont = new Font(bfFont, 14, Font.BOLD, new Color(0, 0, 0));
		Font tileFont = new Font(bfFont, 10, Font.BOLD, new Color(0, 0, 0));
		Font contentFont = new Font(bfFont, 10, Font.NORMAL, new Color(0, 0, 0));
		Font contentFontRed = new Font(bfFont, 10, Font.BOLD, new Color(255, 0, 0));
		Color titleBgColor = new Color(191, 191, 191);
		// Element e = null;
		/* 设置标题1格式 */
		RtfParagraphStyle rtfGsBt1 = RtfParagraphStyle.STYLE_HEADING_1;
		rtfGsBt1.setAlignment(Element.ALIGN_CENTER);
		rtfGsBt1.setStyle(Font.BOLD);
		rtfGsBt1.setSize(16);
		/* 设置标题2格式 */
		RtfParagraphStyle rtfGsBt2 = RtfParagraphStyle.STYLE_HEADING_2;
		rtfGsBt2.setAlignment(Element.ALIGN_CENTER);
		rtfGsBt2.setStyle(Font.NORMAL);
		rtfGsBt2.setSize(14);
		Paragraph cTitle = new Paragraph("物理表的详细设计", chapterFont);
		cTitle.setFont(rtfGsBt1);
		Paragraph sTitle = null;
		document.add(cTitle);
		for(int i = 0; i < list.size(); i++){
			Leaptable t = list.get(i);
			sTitle = new Paragraph(t.getCnname(), sectionFont);
			sTitle.setFont(rtfGsBt2);
			table = new Table(8);
			int [] widths = {90, 120, 84, 28, 47, 28, 28, 28};
			table.setWidths(widths);
			// document.add(new Paragraph("生成表格"));
			table.setBorderWidth(1);
			table.setBorderColor(Color.BLACK);
			table.setPadding(5);
			table.setSpacing(0);
			table.setWidth(100f);
			p = new Paragraph("表　　名", tileFont);
			cell = new Cell(p);
			cell.setHorizontalAlignment(1);
			cell.setVerticalAlignment(1);
			cell.setBackgroundColor(titleBgColor);
			table.addCell(cell);
			p = new Paragraph(t.getName(), contentFont);
			cell = new Cell(p);
			cell.setColspan(7);
			table.addCell(cell);
			p = new Paragraph("中文描述", tileFont);
			cell = new Cell(p);
			cell.setHorizontalAlignment(1);
			cell.setVerticalAlignment(1);
			cell.setBackgroundColor(titleBgColor);
			table.addCell(cell);
			p = new Paragraph(t.getCnname(), contentFont);
			cell = new Cell(p);
			cell.setColspan(7);
			table.addCell(cell);
			p = new Paragraph("列    名", tileFont);
			cell = new Cell(p);
			cell.setHorizontalAlignment(1);
			cell.setVerticalAlignment(1);
			cell.setBackgroundColor(titleBgColor);
			table.addCell(cell);
			p = new Paragraph("中文描述", tileFont);
			cell = new Cell(p);
			cell.setHorizontalAlignment(1);
			cell.setVerticalAlignment(1);
			cell.setBackgroundColor(titleBgColor);
			table.addCell(cell);
			p = new Paragraph("数据类型\n（精度范围）", tileFont);
			cell = new Cell(p);
			cell.setHorizontalAlignment(1);
			cell.setVerticalAlignment(1);
			cell.setBackgroundColor(titleBgColor);
			table.addCell(cell);
			p = new Paragraph("允许空值", tileFont);
			cell = new Cell(p);
			cell.setHorizontalAlignment(1);
			cell.setVerticalAlignment(1);
			cell.setBackgroundColor(titleBgColor);
			table.addCell(cell);
			p = new Paragraph("默认值", tileFont);
			cell = new Cell(p);
			cell.setHorizontalAlignment(1);
			cell.setVerticalAlignment(1);
			cell.setBackgroundColor(titleBgColor);
			table.addCell(cell);
			p = new Paragraph("是否自增", tileFont);
			cell = new Cell(p);
			cell.setHorizontalAlignment(1);
			cell.setVerticalAlignment(1);
			cell.setBackgroundColor(titleBgColor);
			table.addCell(cell);
			p = new Paragraph("是否主键", tileFont);
			cell = new Cell(p);
			cell.setHorizontalAlignment(1);
			cell.setVerticalAlignment(1);
			cell.setBackgroundColor(titleBgColor);
			table.addCell(cell);
			p = new Paragraph("约束条件", tileFont);
			cell = new Cell(p);
			cell.setHorizontalAlignment(1);
			cell.setVerticalAlignment(1);
			cell.setBackgroundColor(titleBgColor);
			table.addCell(cell);
			query = session.createQuery("from Leapdatafield where tablename=:tablename order by orderid");
			query.setString("tablename", t.getName());
			dlist = query.list();
			String dts = "";
			int num = 1;
			StringBuffer remarks = new StringBuffer("");
			Map<String, String> maps = new HashMap<String, String>();
			for(Leapdatafield d: dlist){
				p = new Paragraph(d.getName(), contentFont);
				cell = new Cell(p);
				cell.setVerticalAlignment(1);
				table.addCell(cell);
				p = new Paragraph(d.getCnname(), contentFont);
				cell = new Cell(p);
				cell.setVerticalAlignment(1);
				table.addCell(cell);
				dts = dataType.get(d.getDatatype());
				if(d.getMaxsize() != null){
					if(d.getNumericscale() != null){
						dts += "(" + d.getMaxsize().intValue() + "," + d.getNumericscale().intValue() + ")";
					}else{
						dts += "(" + d.getMaxsize().intValue() + ")";
					}
				}
				p = new Paragraph(dts, contentFont);
				cell = new Cell(p);
				cell.setVerticalAlignment(1);
				table.addCell(cell);
				p = new Paragraph(d.getIsnullable() == null ? "是" : "否", contentFont);
				cell = new Cell(p);
				cell.setHorizontalAlignment(1);
				cell.setVerticalAlignment(1);
				table.addCell(cell);
				p = new Paragraph(d.getDefalutvalue(), contentFont);
				cell = new Cell(p);
				cell.setVerticalAlignment(1);
				table.addCell(cell);
				p = new Paragraph("否", contentFont);
				cell = new Cell(p);
				cell.setHorizontalAlignment(1);
				cell.setVerticalAlignment(1);
				table.addCell(cell);
				p = new Paragraph((d.getIspk() != null && d.getIspk() == 1) ? "是" : "", contentFont);
				cell = new Cell(p);
				cell.setHorizontalAlignment(1);
				cell.setVerticalAlignment(1);
				table.addCell(cell);
				if(d.getCodetype() != null){
					String tmp = getCodeTypes(session, d.getCodetype());
					if(tmp != null){
						if(maps.containsKey(d.getCodetype())){
							p = new Paragraph(maps.get(d.getCodetype()), contentFontRed);
						}else{
							p = new Paragraph("注" + num, contentFontRed);
							maps.put(d.getCodetype(), "注" + num);
							remarks.append("注" + num + "：").append(tmp);
							num++;
						}
					}else{
						p = new Paragraph("", contentFont);
					}
				}else{
					p = new Paragraph("", contentFont);
				}
				cell = new Cell(p);
				cell.setVerticalAlignment(1);
				cell.setHorizontalAlignment(1);
				table.addCell(cell);
			}
			if(remarks.toString().length() > 0){
				p = new Paragraph(remarks.toString(), contentFont);
				cell = new Cell(p);
				cell.setColspan(8);
				table.addCell(cell);
			}
			document.add(sTitle);
			Phrase phrase = new Phrase();
			phrase.add("");
			document.add(phrase);
			// table.setLastHeaderRow(2);//重复表头3行
			document.add(table);
		}
		session.close();
		document.close();
		return path;
	}
}
