/**
 * 
 */
package com.spring.hiber.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hiber.dao.IBookDao;
import com.spring.hiber.service.IBookService;

/**
 * @author zhaocc
 *
 */
@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookDao iBookDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.hiber.service.IBookService#purse(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void purse(String username, String isbn) {
		Integer price = iBookDao.findBookPriceByIsbn(isbn);
		iBookDao.updateBookStock(isbn);
		iBookDao.updateAccountBalance(username, price);

	}

}
