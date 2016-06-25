/**
 * 
 */
package com.spring.demo.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.demo.annotation.respostory.UserRespostory;

/**
 * @author zhaocc
 *
 */
@Service
public class UserService {

	private UserRespostory userRespostory;

	/**
	 * @param userRespostory
	 *            the userRespostory to set
	 */
	// @Qualifier("userRespostoryImpl")
	@Autowired(required = false)
	public void setUserRespostory(@Qualifier("userRespostoryImpl2") UserRespostory userRespostory) {
		this.userRespostory = userRespostory;
	}

	public void servic() {
		System.out.println("UserService servic .... ");
		userRespostory.respostor();
	}
}
