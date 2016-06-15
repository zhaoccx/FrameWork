/**
 * 
 */
package com.spring.test;

/**
 * @author zhaocc
 *
 */
public class Hello {

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
		System.err.println("ssssssssss :" + name);
		this.name = name;
	}

	public void HelloSpring() {
		System.out.println("hello:" + this.getName());
	}

	public Hello() {
		System.out.println("contructs Hello");
	}
}
