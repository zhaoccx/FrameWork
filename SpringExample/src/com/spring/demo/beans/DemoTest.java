/**
 * 
 */
package com.spring.demo.beans;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author zhaocc
 *
 */
public class DemoTest {
	// @SuppressWarnings("resource")
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("com/spring/demo/beans/applicationContext.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/spring/demo/beans/applicationContext.xml");
		Dog dog = context.getBean(Dog.class);
		System.out.println(dog);
		// Dog dog = (Dog) context.getBean("dog");
		Cars bean = (Cars) context.getBean("cars");
		System.out.println(bean);
		bean = (Cars) context.getBean("cars2");
		System.out.println(bean);
		bean = (Cars) context.getBean("cars3");
		System.out.println(bean);

		Persons persons = (Persons) context.getBean("person");
		System.out.println(persons);
		persons = (Persons) context.getBean("person2");
		System.out.println(persons);
		persons = (Persons) context.getBean("person3");
		System.out.println(persons);
		persons = (Persons) context.getBean("person4");
		System.out.println(persons);
		persons = (Persons) context.getBean("person5");
		System.out.println(persons);
		persons = (Persons) context.getBean("person6");
		System.out.println(persons);
		persons = (Persons) context.getBean("person7");
		System.out.println(persons);
		persons = (Persons) context.getBean("person8");
		System.out.println(persons);
		persons = (Persons) context.getBean("person9");
		System.out.println(persons);
		DataSource dataSource = context.getBean(DataSource.class);
		System.out.println(dataSource);
		persons = (Persons) context.getBean("person10");
		System.out.println(persons);

		persons = (Persons) context.getBean("person11");
		System.out.println(persons);
		persons = (Persons) context.getBean("person12");
		System.out.println(persons);

		Man bean2 = (Man) context.getBean("man");
		System.out.println(bean2);

		Address bean3 = (Address) context.getBean("address");
		System.out.println(bean3);
		bean3 = (Address) context.getBean("address2");
		System.out.println(bean3);
		bean3 = (Address) context.getBean("address3");
		System.out.println(bean3);

		Address bAddress = (Address) context.getBean("address");
		System.err.println(bAddress);
		Address aAddress = (Address) context.getBean("address");
		System.err.println(bAddress);
		System.out.println(aAddress == bAddress);

		DataSource datasource = context.getBean(ComboPooledDataSource.class);
		try {
			System.out.println(datasource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		context.close();
	}
}
