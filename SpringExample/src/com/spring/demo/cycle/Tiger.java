/**
 * 
 */
package com.spring.demo.cycle;

/**
 * @author zhaocc
 *
 */
public class Tiger {

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
		System.out.println("set name .....");
		this.name = name;
	}

	public Tiger() {
		System.err.println("tiger constrator ....");
	}

	/**
	 * @param name
	 */
	public Tiger(String name) {
		super();
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}

	public void init() {
		System.out.println("init tiger.....");

	}

	public void init(String str) {
		System.out.println(str + "init tiger.....");

	}

	public void destory() {
		System.out.println("destory tiger....");

	}

	public void destory(int i) {
		System.out.println("destory tiger...." + i);

	}
}
