/**
 * 
 */
package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Car;

/**
 * @author zhaocc
 *
 */
public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car) context.getBean("car");
		System.out.println(car);
	}
}
