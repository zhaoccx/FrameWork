/**
 * 
 */
package com.spring.demo.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaocc
 *
 */
public class DogTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/demo/beans/applicationContext.xml");
		Dog dog = (Dog) context.getBean("dog");
		System.out.println(dog);
	}
}
