/**
 * 
 */
package com.spring.demo.cycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaocc
 *
 */
public class CycleTest {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/spring/demo/cycle/beans-cycle.xml");
		Tiger bean = context.getBean(Tiger.class);
		System.out.println(bean);
		context.close();
	}
}
