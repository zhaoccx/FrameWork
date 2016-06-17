/**
 * 
 */
package com.spring.test.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author zhaocc
 *
 */
public class Person {
	private String name;
	private int age;
	private Car car;
	private List<Car> carlist;
	private Set<Car> carset;
	private Map<String, Car> carmap;

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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the car
	 */
	public Car getCar() {
		return car;
	}

	/**
	 * @param car
	 *            the car to set
	 */
	public void setCar(Car car) {
		this.car = car;
	}

	/**
	 * @return the carlist
	 */
	public List<Car> getCarlist() {
		return carlist;
	}

	/**
	 * @param carlist
	 *            the carlist to set
	 */
	public void setCarlist(List<Car> carlist) {
		this.carlist = carlist;
	}

	/**
	 * @return the carset
	 */
	public Set<Car> getCarset() {
		return carset;
	}

	/**
	 * @param carset
	 *            the carset to set
	 */
	public void setCarset(Set<Car> carset) {
		this.carset = carset;
	}

	/**
	 * @return the carmap
	 */
	public Map<String, Car> getCarmap() {
		return carmap;
	}

	/**
	 * @param carmap
	 *            the carmap to set
	 */
	public void setCarmap(Map<String, Car> carmap) {
		this.carmap = carmap;
	}

	/**
	 * 
	 */
	public Person() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param car
	 */
	public Person(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}

	/**
	 * @param name
	 * @param age
	 * @param car
	 * @param carlist
	 * @param carset
	 * @param carmap
	 */
	public Person(String name, int age, Car car, List<Car> carlist, Set<Car> carset, Map<String, Car> carmap) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
		this.carlist = carlist;
		this.carset = carset;
		this.carmap = carmap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + ", carlist=" + carlist + ", carset=" + carset + ", carmap=" + carmap + "]";
	}

}
