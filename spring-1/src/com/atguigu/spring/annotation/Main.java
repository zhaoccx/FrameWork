package com.atguigu.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");

		UserAction userAction = ctx.getBean(UserAction.class);
		userAction.execute();
		System.out.println("ssssssss");
	}

}
