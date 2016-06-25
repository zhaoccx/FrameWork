/**
 * 
 */
package com.spring.demo.annotation;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.annotation.contorller.UserContorller;
import com.spring.demo.annotation.respostory.UserRespostory;
import com.spring.demo.annotation.service.UserService;

/**
 * @author zhaocc
 *
 */
public class TestAnnotation {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/demo/annotation/bean-annotation.xml");

		try {
			TestOjbect bean = (TestOjbect) context.getBean("testOjbect");
			bean.test();
		} catch (BeansException e) {
			e.printStackTrace();
		}
		try {
			UserRespostory userRespostory = (UserRespostory) context.getBean("userRespostoryImpl");
			userRespostory.respostor();
		} catch (BeansException e) {
			e.printStackTrace();
		}
		try {

			UserContorller userContorller = (UserContorller) context.getBean("userContorller");
			userContorller.contorl();
		} catch (BeansException e) {
			e.printStackTrace();
		}
		try {

			UserService userService = (UserService) context.getBean("userService");
			userService.servic();
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
