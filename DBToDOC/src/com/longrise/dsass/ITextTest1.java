package com.longrise.dsass;

import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.rtf.RtfWriter2;
import com.lowagie.text.rtf.field.RtfPageNumber;
import com.lowagie.text.rtf.field.RtfTotalPageNumber;
import com.lowagie.text.rtf.headerfooter.RtfHeaderFooter;
import com.lowagie.text.rtf.style.RtfFont;
import com.lowagie.text.rtf.style.RtfParagraphStyle;

/**
 * itext 测试
 */
public class ITextTest1 {

	RtfFont tableFont = new RtfFont("宋体_GB2312", 14, Font.COURIER, Color.BLACK);

	public void test() {
		try {
			RtfParagraphStyle rtfGsBt1 = RtfParagraphStyle.STYLE_HEADING_1;
			rtfGsBt1.setAlignment(Element.ALIGN_CENTER);
			rtfGsBt1.setStyle(Font.BOLD);
			rtfGsBt1.setSize(14);
			/* 设置标题2格式 */
			RtfParagraphStyle rtfGsBt2 = RtfParagraphStyle.STYLE_HEADING_2;
			rtfGsBt2.setAlignment(Element.ALIGN_LEFT);
			rtfGsBt2.setStyle(Font.NORMAL);
			rtfGsBt2.setSize(12);

			String path = "doc/";
			File file = new File(path);
			if (!file.exists()) {
				file.mkdirs();
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMDDHHmmss");
			String docName =  sdf.format(new Date()) + ".doc";
			path = path + "" + docName;
			
			Document document = new Document(PageSize.A4.rotate());
			RtfWriter2.getInstance(document, new FileOutputStream(path));
//			document.open();
//			ByteArrayOutputStream baos = new ByteArrayOutputStream();
//			RtfWriter2.getInstance(document, baos);
			document.open();

			Paragraph paragraph1 = new Paragraph("段落1");
			paragraph1.setAlignment(Element.ALIGN_CENTER);
			paragraph1.setFont(rtfGsBt1);
			RtfFont titleFont = new RtfFont("宋体_GB2312", 16, Font.BOLD,
					Color.BLACK);
			// paragraph1.setFont(titleFont);
			document.add(paragraph1);

			paragraph1 = new Paragraph("1:图片");
			paragraph1.setFont(rtfGsBt2);// 2级目录

			document.add(paragraph1);

			Paragraph parafooter = new Paragraph();
			Font footerFont = new RtfFont("宋体_GB2312", 12, Font.BOLD,
					Color.BLACK);
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

			int rows = 6;
			int columns = 5;// 列的个数
			Table table = new Table(columns, rows);

			int[] widths = new int[columns];
			for (int i = 0; i < widths.length; i++) {
				widths[i] = columns;
			}
			table.setWidths(widths);// 设置每列所占比例

			// table.setWidth(100); // 占页面宽度100%
			table.setAlignment(Element.ALIGN_CENTER);// 居中显示
			table.setAlignment(Element.ALIGN_MIDDLE);// 纵向居中显示
			table.setAutoFillEmptyCells(true); // 自动填满
			table.setPadding(2);// 单元格内间距，即文字与单元格边的距离
			table.setSpacing(0);// 单元格之间的间距
			// 表格操作开始
			addCell(table, "1,1");
			addCell(table, "1,2");
			addCell(table, "1,3");

			Cell cell = new Cell(new Phrase("1,4", tableFont));
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setRowspan(1);
			cell.setColspan(2);// 2 列
			cell.setBorderColor(new Color(0, 0, 0));
			cell.setBackgroundColor(Color.blue);
			table.addCell(cell);

			cell = new Cell(new Phrase("1,5", tableFont));
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setRowspan(1);
			cell.setColspan(2);// 2 列
			cell.setBorderColor(new Color(0, 0, 0));
			cell.setBackgroundColor(Color.pink);
			table.addCell(cell);

			cell = new Cell(new Phrase("1,6", tableFont));
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setRowspan(1);
			cell.setColspan(3);// 3 列
			cell.setBorderColor(new Color(0, 0, 0));
			cell.setBackgroundColor(Color.yellow);
			table.addCell(cell);

			cell = new Cell(new Phrase("1,7占4行", tableFont));
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setRowspan(4);// 4行
			cell.setColspan(1);// 1 列
			cell.setBorderColor(new Color(0, 0, 0));
			cell.setBackgroundColor(Color.red);
			table.addCell(cell);

			cell = new Cell(new Phrase("1,8占3列3行", tableFont));
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setRowspan(3);// 4行
			cell.setColspan(3);// 1 列
			cell.setBorderColor(new Color(0, 0, 0));
			cell.setBackgroundColor(Color.GREEN);
			table.addCell(cell);

			cell = new Cell();
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setRowspan(4);// 4行
			cell.setColspan(1);// 1 列
			cell.setBorderColor(new Color(0, 0, 0));
			cell.setBackgroundColor(Color.magenta);
			Image img = Image.getInstance("/me.jpg");
			img.scaleAbsolute(80, 68);
			cell.add(img);
			table.addCell(cell);

			document.add(table);// 表格

			paragraph1 = new Paragraph("2:描述");
			paragraph1.setFont(rtfGsBt2);// 2级目录
			paragraph1.add("图片显示表格的横向合并与纵向合并，并在合并的单元格插入图片。");
			document.add(paragraph1);

			paragraph1 = new Paragraph("段落2");
			paragraph1.setFont(rtfGsBt1);// 2级目录
			document.add(paragraph1);

			paragraph1 = new Paragraph("1:Coding");
			paragraph1.setFont(rtfGsBt2);// 2级目录
			paragraph1.add("Coder 开始写代码了！");
			document.add(paragraph1);

			paragraph1 = new Paragraph("2:吃饭");
			paragraph1.setFont(rtfGsBt2);// 2级目录
			paragraph1.add("Coder 吃饭了。");
			document.add(paragraph1);

			paragraph1 = new Paragraph("3:睡觉");
			paragraph1.setFont(rtfGsBt2);// 2级目录
			paragraph1.add("Coder 睡觉了。");
			document.add(paragraph1);
			document.add(new Paragraph("\n"));

			document.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void addCell(Table table, String content) throws BadElementException {
		Cell cell = new Cell(new Phrase(content, tableFont));
		cell.setVerticalAlignment(Element.ALIGN_CENTER);
		cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		cell.setRowspan(1);
		cell.setColspan(1);
		table.addCell(cell);
	}
	
	public static void main(String[] args) {
		ITextTest1 t = new ITextTest1();
		t.test();
	}
	
}
