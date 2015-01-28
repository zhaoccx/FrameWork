package com.zcc.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("words");

		helloWorld.hello();

		ApplicationContext cxtApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld bean = (HelloWorld) cxtApplicationContext.getBean("hellos");
		bean.hello();
	}
}
