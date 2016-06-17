/**
 * 
 */
package com.spring.beans;

/**
 * @author zhaocc
 *
 */
public class Car {
	private String name;
	private int price;

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
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 
	 */
	public Car() {
		super();
	}

	/**
	 * @param name
	 * @param price
	 */
	public Car(String name, int price) {
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
		return "Car [name=" + name + ", price=" + price + "]";
	}

}
