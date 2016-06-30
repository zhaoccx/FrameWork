/**
 * 
 */
package com.spring.beans;

/**
 * @author zhaocc
 *
 */

public class Person {
	private String name;

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
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 */
	public Person() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public void hello() {
		System.out.print("Hello" + name);
	}

}
