/**
 * 
 */
package com.spring.jdbctest;

/**
 * @author zhaocc
 *
 */
public class Employee {

	private Integer id;
	private String last_name;
	private String email;
	private Department department;

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
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name
	 *            the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	/**
	 * @param id
	 * @param last_name
	 * @param email
	 * @param department
	 */
	public Employee(Integer id, String last_name, String email, Department department) {
		super();
		this.id = id;
		this.last_name = last_name;
		this.email = email;
		this.department = department;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", last_name=" + last_name + ", email=" + email + ", department=" + department + "]";
	}

}
