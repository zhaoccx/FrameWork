/**
 * 
 */
package com.spring.jdbctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author zhaocc
 *
 */
@Repository("iBookDao")
public class BookShopDaoImp implements IBookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.jdbctest.IBookDao#findBookPrice(java.lang.String)
	 */
	@Override
	public int findBookPrice(String isbn) {
		String sql = "SELECT price FROM book WHERE isbn = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, isbn);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.jdbctest.IBookDao#updatBookStore(java.lang.String)
	 */
	@Override
	public void updatBookStore(String isbn) {
		String sql2 = "SELECT stock FROM book_stock WHERE isbn = ?";
		int stock = jdbcTemplate.queryForObject(sql2, Integer.class, isbn);
		if (stock == 0) {
			throw new BookStockException("库存不足");
		}
		String sql = "UPDATE book_stock SET stock = stock -1 WHERE isbn = ?";
		jdbcTemplate.update(sql, isbn);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.jdbctest.IBookDao#updateUserAccount(java.lang.String,
	 * int)
	 */
	@Override
	public void updateUserAccount(String username, int price) {
		String sql2 = "SELECT balance FROM account WHERE username = ?";
		int balance = jdbcTemplate.queryForObject(sql2, Integer.class, username);
		if (balance < price) {
			throw new BookAccountException("余额不足");
		}

		String sql = "UPDATE account SET balance = balance - ? WHERE username = ?";
		jdbcTemplate.update(sql, price, username);
	}

}
