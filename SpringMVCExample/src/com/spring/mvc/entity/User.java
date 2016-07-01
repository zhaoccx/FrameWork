/**
 * 
 */
package com.spring.mvc.entity;

/**
 * @author zhaocc
 *
 */
public class User {
	private String username;
	private String password;
	private String email;
	private Integer age;
	private Address address;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
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
	 * @param username
	 * @param password
	 * @param email
	 * @param age
	 * @param address
	 */
	public User(String username, String password, String email, Integer age, Address address) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
		this.address = address;
	}

	/**
	 * 
	 */
	public User() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", age=" + age + ", address=" + address + "]";
	}

}
