/**
 * 
 */
package com.spring.jdbctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhaocc
 *
 */
@Service("iBookShopServer")
public class BookShopServerImpl implements IBookShopServer {

	@Autowired
	private IBookDao iBookDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.jdbctest.IBookShopServer#purchase(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	@Transactional
	public void purchase(String username, String isbn) {
		int price = iBookDao.findBookPrice(isbn);

		iBookDao.updatBookStore(isbn);

		iBookDao.updateUserAccount(username, price);
	}

}
