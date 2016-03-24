package com.test.hib.ftl.bo;

public class Field {
	private String name;
	private String cnname;
	private String datatype;
	private String increase;
	private String defaultVal;
	private String allowNull;
	private String ispk;
	private String check;
	
	
	
	public Field() {
		super();
	}

	public Field(String name, String cnname, String datatype, String increase,
			String defaultVal, String allowNull, String ispk, String check) {
		super();
		this.name = name;
		this.cnname = cnname;
		this.datatype = datatype;
		this.increase = increase;
		this.defaultVal = defaultVal;
		this.allowNull = allowNull;
		this.ispk = ispk;
		this.check = check;
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

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getIncrease() {
		return increase;
	}

	public void setIncrease(String increase) {
		this.increase = increase;
	}

	public String getDefaultVal() {
		return defaultVal;
	}

	public void setDefaultVal(String defaultVal) {
		this.defaultVal = defaultVal;
	}

	public String getAllowNull() {
		return allowNull;
	}

	public void setAllowNull(String allowNull) {
		this.allowNull = allowNull;
	}

	public String getIspk() {
		return ispk;
	}

	public void setIspk(String ispk) {
		this.ispk = ispk;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

}
