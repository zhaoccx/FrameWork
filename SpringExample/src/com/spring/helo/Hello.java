/**
 * 
 */
package com.spring.helo;

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
		this.name = name;
	}

	/**
	 * 
	 */
	public Hello() {
		System.err.println("con.som.cn");
	}

	public Hello(String string) {
		this.name = string;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hello [name=" + name + "]";
	}

	public void helloSpring() {
		System.out.println("hello" + this.name);
	}
}
