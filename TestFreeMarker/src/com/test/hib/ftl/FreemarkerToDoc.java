package com.test.hib.ftl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import com.test.hib.HibernateSessionFactory;
import com.test.hib.bo.Leapcodetype;
import com.test.hib.bo.Leapcodevalue;
import com.test.hib.bo.Leapdatafield;
import com.test.hib.bo.Leaptable;
import com.test.hib.ftl.bo.CodeType;
import com.test.hib.ftl.bo.CodeValue;
import com.test.hib.ftl.bo.Field;
import com.test.hib.ftl.bo.Table;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreemarkerToDoc {
	private Configuration configuration = null;

	public Map<Integer, String> dataType = new HashMap<Integer, String>();

	public FreemarkerToDoc() {
		configuration = new Configuration();
		configuration.setDefaultEncoding("UTF-8");
	}

	public void putSQLDataType() {
		this.dataType.put(12, "nvarchar");
		this.dataType.put(4, "int");
		this.dataType.put(93, "datetime");
		this.dataType.put(91, "date");
		this.dataType.put(3, "decimal");
		this.dataType.put(2004, "image");
	}

	/**
	 * @param type
	 *            1、数据表；2、视图
	 * @return
	 */
	public List<Table> getAllTableOrViews(String type) {
		List<Table> list = new ArrayList<Table>();
		List<CodeType> codeTypes = null;
		List<Field> fields = null;

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "from Leaptable where name like 'dsass%' and tabletype=:tabletype order by name";
		Query query = session.createQuery(hql);
		query.setString("tabletype", type);
		List<Leaptable> tableList = query.list();
		Field f = null;
		List<Leapdatafield> dlist = null;
		for (int i = 0; i < tableList.size(); i++) {
			Leaptable t = tableList.get(i);
			codeTypes = new ArrayList<CodeType>();
			fields = new ArrayList<Field>();
			query = session
					.createQuery("from Leapdatafield where tablename=:tablename order by orderid");
			query.setString("tablename", t.getName());
			dlist = query.list();
			String dts = "";
			int num = 1;
			Map<String, String> maps = new HashMap<String, String>();
			for (Leapdatafield d : dlist) {
				f = new Field();
				f.setName(d.getName());
				f.setCnname(d.getCnname() == null ? "" : d.getCnname());
				dts = this.dataType.get(d.getDatatype());
				if (d.getMaxsize() != null) {
					if (d.getNumericscale() != null) {
						dts += "(" + d.getMaxsize().intValue() + ","
								+ d.getNumericscale().intValue() + ")";
					} else {
						dts += "(" + d.getMaxsize().intValue() + ")";
					}
				}
				f.setDatatype(dts);
				f.setAllowNull(d.getIsnullable() == null ? "是" : "否");
				f.setDefaultVal(d.getDefalutvalue() == null ? "" : d
						.getDefalutvalue());
				f.setIncrease("");
				f.setIspk((d.getIspk() != null && d.getIspk() == 1) ? "是" : "");
				String remark = "";
				if (d.getCodetype() != null) {
					CodeType codeType = getCodeType(session, d.getCodetype());
					if (codeType != null) {
						if (maps.containsKey(d.getCodetype())) {
							remark = maps.get(d.getCodetype());
						} else {
							codeTypes.add(codeType);
							remark = "注" + num;
							maps.put(d.getCodetype(), "注" + num);
							num++;
						}
					}
				}
				f.setCheck(remark);
				fields.add(f);
			}
			list.add(new Table(t.getName(), t.getCnname(), fields, codeTypes));
		}
		session.close();
		return list;
	}

	public List<CodeType> getCodeTypes() {
		List<CodeType> codetypes = new ArrayList<CodeType>();
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		CodeType codeType = null;
		List<CodeValue> codeValues = null;
		String hql = "from Leapcodetype where codetypename like 'dsass%'";
		Query query = session.createQuery(hql);
		List<Leapcodetype> types = query.list();
		if (types != null) {
			for (Leapcodetype type : types) {
				codeType = new CodeType();
				String vhql = "from Leapcodevalue where codetypename = :codetypename";
				codeType.setCnname(type.getCodetablecnname());
				codeType.setName(type.getCodetypename());
				codeType.setParentname(type.getParentcodetypename());
				codeType.setEnname(type.getCodetypeenname());
				query = session.createQuery(vhql);
				query.setString("codetypename", type.getCodetypename());
				@SuppressWarnings("unchecked")
				List<Leapcodevalue> list = query.list();
				if (list != null && list.size() > 0) {
					codeValues = new ArrayList<CodeValue>();
					Collections.sort(list);
					for (Leapcodevalue c : list) {
						codeValues.add(new CodeValue(c.getCodeid(), c
								.getCodevalue()));
					}
				}
				codeType.setCodeValues(codeValues);
				codetypes.add(codeType);
			}
		}
		return codetypes;
	}

	private CodeType getCodeType(Session session, String codetypename) {
		CodeType codeType = null;
		List<CodeValue> codeValues = null;
		String hql = "from Leapcodetype where codetypename = :codetypename order by codetypename";
		Query query = session.createQuery(hql);
		query.setString("codetypename", codetypename);
		Leapcodetype type = (Leapcodetype) query.uniqueResult();
		if (type != null) {
			codeType = new CodeType();
			String vhql = "from Leapcodevalue where codetypename = :codetypename";
			codeType.setCnname(type.getCodetablecnname());
			codeType.setName(type.getCodetypename());
			codeType.setParentname(type.getParentcodetypename());
			query = session.createQuery(vhql);
			query.setString("codetypename", codetypename);
			@SuppressWarnings("unchecked")
			List<Leapcodevalue> list = query.list();
			if (list != null && list.size() > 0) {
				codeValues = new ArrayList<CodeValue>();
				Collections.sort(list);
				for (Leapcodevalue c : list) {
					codeValues.add(new CodeValue(c.getCodeid(), c
							.getCodevalue()));
				}
			}
			codeType.setCodeValues(codeValues);
		}
		return codeType;
	}

	public void createDoc() {
		configuration.setClassForTemplateLoading(this.getClass(), "/");
		Template t = null;
		Writer out = null;
		try {
			t = configuration.getTemplate("template.xml");
			String path = "doc/";
			File file = new File(path);
			if (!file.exists()) {
				file.mkdirs();
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMDDHHmmss");
			String docName = "dsass" + sdf.format(new Date()) + ".doc";
			path = path + "" + docName;

			File outFile = new File(path);
			System.out.println("创建文件：" + path);
			out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(outFile), "utf-8"));
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("tables", this.getAllTableOrViews("1"));
			data.put("views", this.getAllTableOrViews("2"));
			data.put("codeTypes", this.getCodeTypes());
			Date d = new Date();
			System.out.println("开始生成文档。。。"+d.toLocaleString());
			t.process(data, out);
			Date d1 = new Date();
			System.out.println("文档生成完成。。。"+d1.toLocaleString());
			System.out.println("耗时：" + (d1.getTime() - d.getTime()) + "毫秒");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		FreemarkerToDoc ftd = new FreemarkerToDoc();
		ftd.putSQLDataType();
		ftd.createDoc();
	}

}
