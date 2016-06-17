/**
 * 
 */
package com.spring.test.beans;

/**
 * @author zhaocc
 *
 */
public class Car {
	private String name;
	private String build;
	private int price;
	private double momery;

	/**
	 * @param name
	 * @param build
	 * @param price
	 */
	public Car(String name, String build, int price) {
		super();
		this.name = name;
		this.build = build;
		this.price = price;
	}

	/**
	 * @param name
	 * @param build
	 * @param momery
	 */
	public Car(String name, String build, double momery) {
		super();
		this.name = name;
		this.build = build;
		this.momery = momery;
	}

	/**
	 * @param name
	 * @param build
	 * @param price
	 * @param momery
	 */
	public Car(String name, String build, int price, double momery) {
		super();
		this.name = name;
		this.build = build;
		this.price = price;
		this.momery = momery;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [name=" + name + ", build=" + build + ", price=" + price + ", momery=" + momery + "]";
	}

}
