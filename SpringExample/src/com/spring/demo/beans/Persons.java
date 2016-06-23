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
	private List<Cars> cList;
	private Set<Cars> sCars;
	private Map<String, Cars> map;

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
	 * @return the cList
	 */
	public List<Cars> getcList() {
		return cList;
	}

	/**
	 * @param cList
	 *            the cList to set
	 */
	public void setcList(List<Cars> cList) {
		this.cList = cList;
	}

	/**
	 * @return the sCars
	 */
	public Set<Cars> getsCars() {
		return sCars;
	}

	/**
	 * @param sCars
	 *            the sCars to set
	 */
	public void setsCars(Set<Cars> sCars) {
		this.sCars = sCars;
	}

	/**
	 * @return the map
	 */
	public Map<String, Cars> getMap() {
		return map;
	}

	/**
	 * @param map
	 *            the map to set
	 */
	public void setMap(Map<String, Cars> map) {
		this.map = map;
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
	 * @param cars
	 * @param cList
	 */
	public Persons(String name, int age, Cars cars, List<Cars> cList) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
		this.cList = cList;
	}

	/**
	 * @param name
	 * @param age
	 * @param sCars
	 */
	public Persons(String name, int age, Set<Cars> sCars) {
		super();
		this.name = name;
		this.age = age;
		this.sCars = sCars;
	}

	/**
	 * @param name
	 * @param age
	 * @param map
	 */
	public Persons(String name, int age, Map<String, Cars> map) {
		super();
		this.name = name;
		this.age = age;
		this.map = map;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persons [name=" + name + ", age=" + age + ", cars=" + cars + ", cList=" + cList + ", sCars=" + sCars + ", map=" + map + "]";
	}

}
