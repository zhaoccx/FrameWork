/**
 * 
 */
package com.spring.demo.annotation.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.demo.annotation.service.UserService;

/**
 * @author zhaocc
 *
 */
@Controller
public class UserContorller {

	@Autowired
	private UserService userService;

	public void contorl() {
		System.out.println("UserContorller  ..  cont ");
		userService.servic();
	}
}
