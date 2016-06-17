/**
 * 
 */
package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.beans.Car;
import com.spring.test.beans.Person;

/**
 * @author zhaocc
 *
 */
public class Ma {
	public static void main2(String[] args) {
		Hello hello = new Hello();
		hello.setName("abc");
		hello.HelloSpring();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		if (context.getBean("hello") instanceof Hello) {
			Hello bean = (Hello) context.getBean("hello");
			bean.HelloSpring();
		}

		Car bean = (Car) context.getBean("car");
		System.out.println(bean);

		Car bean2 = (Car) context.getBean("car2");
		System.out.println(bean2);

		Person Person = (Person) context.getBean("person");
		System.out.println(Person);
		Person Person2 = (Person) context.getBean("person2");
		System.out.println(Person2);

		Person Person4 = (Person) context.getBean("person4");
		System.out.println(Person4);
	}
}
