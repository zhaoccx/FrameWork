/**
 * 
 */
package com.spring.jdbctest;

/**
 * @author zhaocc
 *
 */
public interface IBookDao {
	public int findBookPrice(String isbn);

	public void updatBookStore(String isbn);

	public void updateUserAccount(String username, int price);

}
