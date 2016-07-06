/**
 * 
 */
package com.introduce.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author zhaocc
 *
 */
public class Person {

	private String name;
	private String pwd;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd
	 *            the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@JsonIgnore
	public String getBody() {
		return "Body 好";
	}

	public String getWeight() {
		return "身高不错";
	}

	/**
	 * 
	 */
	public Person() {
		super();
	}

	/**
	 * @param name
	 * @param pwd
	 */
	public Person(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}

}
