package cn.itcast.ssh.test;

import org.junit.Test;


import cn.itcast.ssh.util.SqringInit;

public class SessionFactoryTest extends SqringInit{
	@Test
	public void testSessionFactory(){
		
		context.getBean("sessionFactory");
	}
}
