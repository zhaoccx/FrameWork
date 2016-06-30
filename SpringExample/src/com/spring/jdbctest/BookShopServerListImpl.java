/**
 * 
 */
package com.spring.jdbctest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhaocc
 *
 */
@Service
public class BookShopServerListImpl implements IBookShopServerList {
	@Autowired
	private IBookShopServer IBookShopServer;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.jdbctest.IBookShopServerList#purchase(java.lang.String,
	 * java.util.List)
	 */
	@Transactional
	@Override
	public void purchase(String username, List<String> isbns) {
		if (null != isbns && isbns.size() > 0) {
			for (String isbn : isbns) {
				IBookShopServer.purchase(username, isbn);
			}
		}
	}

}
