package com.test.hib.ftl.bo;
import java.util.List;

public class Table {

	private String name;
	private String cnname;
	private List<Field> fields;
	private List<CodeType> codeTypes;
	
	
	public Table() {
		super();
	}

	public Table(String name, String cnname, List<Field> fields,
			List<CodeType> codeTypes) {
		super();
		this.name = name;
		this.cnname = cnname;
		this.fields = fields;
		this.codeTypes = codeTypes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnname() {
		return cnname;
	}

	public void setCnname(String cnname) {
		this.cnname = cnname;
	}

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	public List<CodeType> getCodeTypes() {
		return codeTypes;
	}

	public void setCodeTypes(List<CodeType> codeTypes) {
		this.codeTypes = codeTypes;
	}

}
