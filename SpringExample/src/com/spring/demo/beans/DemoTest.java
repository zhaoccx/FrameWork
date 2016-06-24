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
public class DemoTest {
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

		Persons persons = (Persons) context.getBean("person");
		System.out.println(persons);
		persons = (Persons) context.getBean("person2");
		System.out.println(persons);
		persons = (Persons) context.getBean("person3");
		System.out.println(persons);
		persons = (Persons) context.getBean("person4");
		System.out.println(persons);
		persons = (Persons) context.getBean("person5");
		System.out.println(persons);
		persons = (Persons) context.getBean("person6");
		System.out.println(persons);
		persons = (Persons) context.getBean("person7");
		System.out.println(persons);
		persons = (Persons) context.getBean("person8");
		System.out.println(persons);
		persons = (Persons) context.getBean("person9");
		System.out.println(persons);
		DataSource dataSource = context.getBean(DataSource.class);
		System.out.println(dataSource);
		persons = (Persons) context.getBean("person10");
		System.out.println(persons);

		persons = (Persons) context.getBean("person11");
		System.out.println(persons);

		Man bean2 = (Man) context.getBean("man");
		System.out.println(bean2);
		context.close();
	}
}
