/**
 * 
 */
package com.spring.demo.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.annotation.respostory.UserRespostory;

/**
 * @author zhaocc
 *
 */
@Service
public class UserService {

	@Autowired
	private UserRespostory userRespostory;

	public void servic() {
		System.out.println("UserService servic .... ");
		userRespostory.respostor();
	}
}
