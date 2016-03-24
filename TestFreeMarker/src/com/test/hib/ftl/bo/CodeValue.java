package com.test.hib.ftl.bo;

public class CodeValue implements Comparable<CodeValue> {

	private String codeid;
	private String codevalue;

	
	
	public CodeValue() {
		super();
	}

	public CodeValue(String codeid, String codevalue) {
		super();
		this.codeid = codeid;
		this.codevalue = codevalue;
	}

	public String getCodeid() {
		return codeid;
	}

	public void setCodeid(String codeid) {
		this.codeid = codeid;
	}

	public String getCodevalue() {
		return codevalue;
	}

	public void setCodevalue(String codevalue) {
		this.codevalue = codevalue;
	}

	public int compareTo(CodeValue o) {
		try {
			if (Integer.parseInt(this.codeid) > Integer.parseInt(o.getCodeid())) {
				return 1;
			} else {
				return 0;
			}
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
