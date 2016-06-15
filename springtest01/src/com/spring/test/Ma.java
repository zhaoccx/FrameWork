/**
 * 
 */
package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaocc
 *
 */
public class Ma {
	public static void main2(String[] args) {
		Hello hello = new Hello();
		hello.setName("abc");
		hello.HelloSpring();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		if (context.getBean("hello") instanceof Hello) {
			Hello bean = (Hello) context.getBean("hello");
			bean.HelloSpring();
		}
	}
}
