/**
 * 
 */
package com.spring.aop.cala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaocc
 *
 */
public class AopTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/cala/bean-aop.xml");
		// IArch bean = (IArch) context.getBean("archImpl");
		// System.out.println("result: " + bean.add(3, 5));
		// System.out.println("result: " + bean.sub(3, 5));
		// System.out.println("result: " + bean.div(3, 2));
		IArch bean = (IArch) context.getBean("iarch");
		System.out.println("result: " + bean.add(3, 5));
	}
}
