/**
 * 
 */
package com.spring.hiber.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.hiber.dao.IBookDao;
import com.spring.hiber.execption.AccountBalanceExecption;
import com.spring.hiber.execption.BookStockExecption;

/**
 * @author zhaocc
 *
 */
@Repository
public class BookDaoImpl implements IBookDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spring.hiber.dao.IBookDao#findBookPriceFromIsbn(java.lang.String)
	 */
	@Override
	public Integer findBookPriceByIsbn(String isbn) {
		String hql = "SELECT b.price FROM Book b WHERE b.isbn = ?";
		Query query = getSession().createQuery(hql).setString(0, isbn);
		return (Integer) query.uniqueResult();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.hiber.dao.IBookDao#updateBookStock(java.lang.String)
	 */
	@Override
	public void updateBookStock(String isbn) {
		String hql2 = "SELECT b.stock FROM Book b WHERE b.isbn = ?";
		Integer result = (Integer) getSession().createQuery(hql2).setString(0, isbn).uniqueResult();
		if (0 == result) {
			throw new BookStockExecption("书本" + isbn + "库存不足");
		}
		String hql = "UPDATE Book b SET b.stock = b.stock -1 WHERE b.isbn = ?";
		getSession().createQuery(hql).setString(0, isbn).executeUpdate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.hiber.dao.IBookDao#updateAccountBalance(java.lang.String,
	 * java.lang.Integer)
	 */
	@Override
	public void updateAccountBalance(String username, Integer price) {
		String hql2 = "SELECT a.balance FROM Account a WHERE a.userName = ?";
		Integer result = (Integer) getSession().createQuery(hql2).setString(0, username).uniqueResult();
		if (result < price) {
			throw new AccountBalanceExecption("用户【 " + username + " 】的余额不足");
		}
		String hql = "UPDATE Account a SET a.balance = a.balance - ? WHERE a.userName = ?";
		getSession().createQuery(hql).setInteger(0, price).setString(1, username).executeUpdate();
	}
}
