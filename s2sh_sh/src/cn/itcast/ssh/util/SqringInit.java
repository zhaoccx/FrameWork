package cn.itcast.ssh.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SqringInit {
	public static ApplicationContext context;
	static{
		context=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		
	}

}
