package com.longrise.dsass.ftl.bo;

import java.util.List;

public class CodeType {

	private String name;
	private String cnname;
	private String enname;
	private String parentname;
	private List<CodeValue> codeValues;

	public CodeType() {
		super();
	}

	public CodeType(String name, String cnname, String enname,
			String parentname, List<CodeValue> codeValues) {
		super();
		this.name = name;
		this.cnname = cnname;
		this.enname = enname;
		this.parentname = parentname;
		this.codeValues = codeValues;
	}

	public String getEnname() {
		return enname;
	}

	public void setEnname(String enname) {
		this.enname = enname;
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

	public String getParentname() {
		return parentname;
	}

	public void setParentname(String parentname) {
		this.parentname = parentname;
	}

	public List<CodeValue> getCodeValues() {
		return codeValues;
	}

	public void setCodeValues(List<CodeValue> codeValues) {
		this.codeValues = codeValues;
	}
}
