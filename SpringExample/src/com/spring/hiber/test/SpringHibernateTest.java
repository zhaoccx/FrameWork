/**
 * 
 */
package com.spring.hiber.test;

import java.sql.SQLException;
import java.util.Arrays;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.hiber.service.IBookService;
import com.spring.hiber.service.IBookServices;

/**
 * @author zhaocc
 *
 */
public class SpringHibernateTest {

	private ApplicationContext context = null;
	private IBookService iBookService = null;
	private IBookServices iBookServices = null;

	{
		context = new ClassPathXmlApplicationContext("com/spring/hiber/beans-hibernate.xml");
		iBookService = context.getBean(IBookService.class);
		iBookServices = context.getBean(IBookServices.class);
	}

	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSources = context.getBean(DataSource.class);
		System.out.println(dataSources.getConnection());
	}

	@Test
	public void testBookServiceTest() {
		iBookService.purse("aa", "1002");
	}

	@Test
	public void testBookServicesTest() {
		iBookServices.checkout("aa", Arrays.asList("1001", "1002"));
	}

}
