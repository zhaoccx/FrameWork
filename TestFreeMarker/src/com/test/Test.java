package com.test;

import org.hibernate.Session;

import com.test.hib.HibernateSessionFactory;

public class Test{
	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String [] args){
		Session session = HibernateSessionFactory.getSession();
	}
}
