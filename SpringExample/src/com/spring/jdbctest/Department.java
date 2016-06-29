/**
 * 
 */
package com.spring.jdbctest;

/**
 * @author zhaocc
 *
 */
public class Department {
	private Integer id;
	private String deptname;

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
	 * @return the deptname
	 */
	public String getDeptname() {
		return deptname;
	}

	/**
	 * @param deptname
	 *            the deptname to set
	 */
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	/**
	 * 
	 */
	public Department() {
		super();
	}

	/**
	 * @param id
	 * @param deptname
	 */
	public Department(Integer id, String deptname) {
		super();
		this.id = id;
		this.deptname = deptname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptname=" + deptname + "]";
	}

}
