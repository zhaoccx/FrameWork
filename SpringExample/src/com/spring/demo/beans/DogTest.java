/**
 * 
 */
package com.spring.demo.beans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaocc
 *
 */
public class DogTest {
	// @SuppressWarnings("resource")
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("com/spring/demo/beans/applicationContext.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/spring/demo/beans/applicationContext.xml");
		Dog dog = context.getBean(Dog.class);
		System.out.println(dog);
		// Dog dog = (Dog) context.getBean("dog");
		Cars bean = (Cars) context.getBean("cars");
		System.out.println(bean);
		bean = (Cars) context.getBean("cars2");
		System.out.println(bean);
		bean = (Cars) context.getBean("cars3");
		System.out.println(bean);
		context.close();
	}
}
