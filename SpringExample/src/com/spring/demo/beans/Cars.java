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
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the corp
	 */
	public String getCorp() {
		return corp;
	}

	/**
	 * @param corp
	 *            the corp to set
	 */
	public void setCorp(String corp) {
		this.corp = corp;
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
	 * @return the maxSpeed
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed
	 *            the maxSpeed to set
	 */
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

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
