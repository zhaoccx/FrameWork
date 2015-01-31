package com.zcc.springmvc.entites;

public class Address {
	private String provice;
	private String city;
	private String county;

	public String getProvice() {
		return provice;
	}

	public void setProvice(String provice) {
		this.provice = provice;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	@Override
	public String toString() {
		return "Address [provice=" + provice + ", city=" + city + ", county=" + county + "]";
	}

}
