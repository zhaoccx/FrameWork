/**
 * 
 */
package com.spring.helo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaocc
 *
 */
public class HeloTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/helo/beans.xml");
		Hello bean = (Hello) context.getBean("hello");
		System.out.println(bean.toString());
		bean.helloSpring();
	}
}
