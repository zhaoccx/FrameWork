/**
 * 
 */
package com.spring.hiber.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hiber.service.IBookService;
import com.spring.hiber.service.IBookServices;

/**
 * @author zhaocc
 *
 */
@Service
public class BookServicesImpl implements IBookServices {

	@Autowired
	private IBookService iBookService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.hiber.service.IBookServices#checkout(java.lang.String,
	 * java.util.List)
	 */
	// @Transactional
	@Override
	public void checkout(String username, List<String> isbns) {
		for (String isbn : isbns) {
			iBookService.purse(username, isbn);
		}
	}

}
