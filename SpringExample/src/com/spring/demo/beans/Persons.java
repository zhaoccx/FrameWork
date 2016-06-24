/**
 * 
 */
package com.spring.demo.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author zhaocc
 *
 */
public class Persons {

	private String name;
	private int age;
	private Cars cars;
	private List<Cars> listCars;
	private Set<Cars> setCars;
	private Map<String, Cars> mapCars;

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
	 * @return the listCars
	 */
	public List<Cars> getListCars() {
		return listCars;
	}

	/**
	 * @param listCars
	 *            the listCars to set
	 */
	public void setListCars(List<Cars> listCars) {
		this.listCars = listCars;
	}

	/**
	 * @return the setCars
	 */
	public Set<Cars> getSetCars() {
		return setCars;
	}

	/**
	 * @param setCars
	 *            the setCars to set
	 */
	public void setSetCars(Set<Cars> setCars) {
		this.setCars = setCars;
	}

	/**
	 * @return the mapCars
	 */
	public Map<String, Cars> getMapCars() {
		return mapCars;
	}

	/**
	 * @param mapCars
	 *            the mapCars to set
	 */
	public void setMapCars(Map<String, Cars> mapCars) {
		this.mapCars = mapCars;
	}

	/**
	 * 
	 */
	public Persons() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param cars
	 */
	public Persons(String name, int age, Cars cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}

	/**
	 * @param name
	 * @param age
	 * @param listCars
	 */
	public Persons(String name, int age, List<Cars> listCars) {
		super();
		this.name = name;
		this.age = age;
		this.listCars = listCars;
	}

	/**
	 * @param name
	 * @param age
	 * @param setCars
	 */
	public Persons(String name, int age, Set<Cars> setCars) {
		super();
		this.name = name;
		this.age = age;
		this.setCars = setCars;
	}

	/**
	 * @param name
	 * @param age
	 * @param mapCars
	 */
	public Persons(String name, int age, Map<String, Cars> mapCars) {
		super();
		this.name = name;
		this.age = age;
		this.mapCars = mapCars;
	}

	/**
	 * @param name
	 * @param age
	 * @param cars
	 * @param mapCars
	 */
	public Persons(String name, int age, Cars cars, Map<String, Cars> mapCars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
		this.mapCars = mapCars;
	}

	/**
	 * @param name
	 * @param age
	 * @param cars
	 * @param setCars
	 */
	public Persons(String name, int age, Cars cars, Set<Cars> setCars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
		this.setCars = setCars;
	}

	/**
	 * @param name
	 * @param age
	 * @param cars
	 * @param listCars
	 */
	public Persons(String name, int age, Cars cars, List<Cars> listCars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
		this.listCars = listCars;
	}

	/**
	 * @param name
	 * @param age
	 * @param cars
	 * @param listCars
	 * @param setCars
	 * @param mapCars
	 */
	public Persons(String name, int age, Cars cars, List<Cars> listCars, Set<Cars> setCars, Map<String, Cars> mapCars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
		this.listCars = listCars;
		this.setCars = setCars;
		this.mapCars = mapCars;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persons [name=" + name + ", age=" + age + ", cars=" + cars + ", listCars=" + listCars + ", setCars=" + setCars + ", mapCars=" + mapCars + "]";
	}

}
