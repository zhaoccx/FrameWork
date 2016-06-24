/**
 * 
 */
package com.spring.demo.beans;

/**
 * @author zhaocc
 *
 */
public class Man {

	private String name;
	private Address address;
	private Cars cars;

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
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the cars
	 */
	public Cars getCars() {
		return cars;
	}

	/**
	 * @param cars
	 *            the cars to set
	 */
	public void setCars(Cars cars) {
		this.cars = cars;
	}

	/**
	 * 
	 */
	public Man() {
		super();
	}

	/**
	 * @param name
	 * @param address
	 * @param cars
	 */
	public Man(String name, Address address, Cars cars) {
		super();
		this.name = name;
		this.address = address;
		this.cars = cars;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Man [name=" + name + ", address=" + address + ", cars=" + cars + "]";
	}

}
