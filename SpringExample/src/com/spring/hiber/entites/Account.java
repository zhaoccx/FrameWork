/**
 * 
 */
package com.spring.hiber.entites;

/**
 * @author zhaocc
 *
 */
public class Account {

	private Integer id;
	private String userName;
	private int balance;

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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	/**
	 * @param id
	 * @param userName
	 * @param balance
	 */
	public Account(Integer id, String userName, int balance) {
		super();
		this.id = id;
		this.userName = userName;
		this.balance = balance;
	}

	/**
	 * 
	 */
	public Account() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [id=" + id + ", userName=" + userName + ", balance=" + balance + "]";
	}

}
