package com.zcc.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// HelloWorld helloWorld = new HelloWorld();
		// helloWorld.setName("words");
		//
		// helloWorld.hello();

		ApplicationContext cxtApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld bean = (HelloWorld) cxtApplicationContext.getBean("hell");
		bean.hello();

		Car car = (Car) cxtApplicationContext.getBean("car");
		System.out.println(car);
		car = (Car) cxtApplicationContext.getBean("car2");
		System.out.println(car);

		Person p = (Person) cxtApplicationContext.getBean("person");
		System.out.println(p);
	}
}
