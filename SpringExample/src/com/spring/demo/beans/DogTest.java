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
	public void main(String[] args) {
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

		Persons persons = (Persons) context.getBean("person");
		System.out.println(persons);
		persons = (Persons) context.getBean("person2");
		System.out.println(persons);
		persons = (Persons) context.getBean("person3");
		System.out.println(persons);

		context.close();
	}
}
