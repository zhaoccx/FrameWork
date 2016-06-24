/**
 * 
 */
package com.spring.demo.factory;

/**
 * @author zhaocc
 *
 */
public class Fact {
	private String name;
	private double price;

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
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * 
	 */
	public Fact() {
		super();
	}

	/**
	 * @param name
	 * @param price
	 */
	public Fact(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fact [name=" + name + ", price=" + price + "]";
	}

}
