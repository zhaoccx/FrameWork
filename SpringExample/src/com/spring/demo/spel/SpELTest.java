/**
 * 
 */
package com.spring.demo.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaocc
 *
 */
public class SpELTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/demo/spel/spring-spel.xml");
		Cat cat = (Cat) context.getBean("cat");
		System.out.println(cat);

		Fash fash = (Fash) context.getBean("fash");
		System.err.println(fash);

		Woman woman = (Woman) context.getBean("woman");
		System.out.println(woman);

	}
}
