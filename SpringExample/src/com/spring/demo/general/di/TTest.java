/**
 * 
 */
package com.spring.demo.general.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaocc
 *
 */
public class TTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/demo/general/di/beans-general-di.xml");
		UserService userService = (UserService) context.getBean("userService");
		userService.add();
	}
}
