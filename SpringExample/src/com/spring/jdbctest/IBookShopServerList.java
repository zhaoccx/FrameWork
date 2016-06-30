/**
 * 
 */
package com.spring.jdbctest;

import java.util.List;

/**
 * @author zhaocc
 *
 */
public interface IBookShopServerList {
	public void purchase(String username, List<String> isbns);
}
