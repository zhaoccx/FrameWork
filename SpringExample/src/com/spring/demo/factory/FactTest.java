/**
 * 
 */
package com.spring.demo.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaocc
 *
 */
public class FactTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/demo/factory/bean-factory.xml");
		Fact bean = (Fact) context.getBean("fact");
		System.out.println(bean);

		Fact bean2 = (Fact) context.getBean("fact1");
		System.out.println(bean2);
		System.out.println(context);
	}
}
