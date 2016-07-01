/**
 * 
 */
package com.spring.mvc.entity;

/**
 * @author zhaocc
 *
 */
public class User2 extends User {
	private Integer id;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param username
	 * @param password
	 * @param email
	 * @param age
	 * @param address
	 * @param id
	 */
	public User2(String username, String password, String email, Integer age, Address address, Integer id) {
		super(username, password, email, age, address);
		this.id = id;
	}

	/**
	 * @param id
	 */
	public User2(Integer id) {
		super();
		this.id = id;
	}

	/**
	 * 
	 */
	public User2() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User2 [id=" + id + ", toString()=" + super.toString() + "]";
	}

}
