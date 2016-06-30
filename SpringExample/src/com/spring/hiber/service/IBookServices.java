/**
 * 
 */
package com.spring.hiber.service;

import java.util.List;

/**
 * @author zhaocc
 *
 */
public interface IBookServices {

	public void checkout(String username, List<String> isbns);
}
