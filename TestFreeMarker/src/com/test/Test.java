package com.test;

import org.hibernate.Session;

import com.test.hib.HibernateSessionFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Session session = HibernateSessionFactory.getSession();
		
	}

}
