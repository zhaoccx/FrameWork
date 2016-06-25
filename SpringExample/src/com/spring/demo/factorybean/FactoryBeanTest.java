/**
 * 
 */
package com.spring.demo.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaocc
 *
 */
public class FactoryBeanTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/demo/factorybean/bean-factorybean.xml");
		Book bean = (Book) context.getBean("book");
		System.out.println(bean);
	}
}
