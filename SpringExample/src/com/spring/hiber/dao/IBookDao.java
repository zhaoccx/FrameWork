/**
 * 
 */
package com.spring.hiber.dao;

/**
 * @author zhaocc
 *
 */
public interface IBookDao {

	public Integer findBookPriceByIsbn(String isbn);

	public void updateBookStock(String isbn);

	public void updateAccountBalance(String username, Integer price);
}
