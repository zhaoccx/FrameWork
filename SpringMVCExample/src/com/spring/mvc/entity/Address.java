/**
 * 
 */
package com.spring.mvc.entity;

/**
 * @author zhaocc
 *
 */
public class Address {
	private String provice;
	private String city;
	private String street;
	private String county;
	private String team;

	/**
	 * @return the provice
	 */
	public String getProvice() {
		return provice;
	}

	/**
	 * @param provice
	 *            the provice to set
	 */
	public void setProvice(String provice) {
		this.provice = provice;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county
	 *            the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team
	 *            the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	/**
	 * @param provice
	 * @param city
	 * @param street
	 * @param county
	 * @param team
	 */
	public Address(String provice, String city, String street, String county, String team) {
		super();
		this.provice = provice;
		this.city = city;
		this.street = street;
		this.county = county;
		this.team = team;
	}

	/**
	 * 
	 */
	public Address() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [provice=" + provice + ", city=" + city + ", street=" + street + ", county=" + county + ", team=" + team + "]";
	}

}
