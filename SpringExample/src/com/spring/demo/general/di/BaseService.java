/**
 * 
 */
package com.spring.demo.general.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhaocc
 *
 */
public class BaseService<T> {

	@Autowired
	private BaseRepository<T> baseRepository;

	public void add() {
		System.out.println("BaseService .....  add..........");
		System.out.println(baseRepository);

	}
}
