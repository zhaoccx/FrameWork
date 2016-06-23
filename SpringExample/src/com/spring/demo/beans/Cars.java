/**
 * 
 */
package com.spring.demo.beans;

/**
 * @author zhaocc
 *
 */
public class Cars {
	private String brand;
	private String corp;
	private int price;
	private double maxSpeed;

	/**
	 * 
	 */
	public Cars() {
		super();
	}

	/**
	 * @param brand
	 * @param corp
	 * @param price
	 */
	public Cars(String brand, String corp, int price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}

	/**
	 * @param brand
	 * @param corp
	 * @param maxSpeed
	 */
	public Cars(String brand, String corp, double maxSpeed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.maxSpeed = maxSpeed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cars [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}

}
