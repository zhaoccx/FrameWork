package com.zcc.spring.beans;

import java.util.Calendar;

public class HelloWorld {
	private String userName;

	public String getUserName() {
		System.out.println("getName");
		return userName;
	}

	public void setUserName(String name) {
		System.out.println("setName" + name);
		this.userName = name;
	}

	public void hello() {
		System.out.println("hello : " + userName);
	}

	public HelloWorld(String name) {
		super();
		this.userName = name;
	}

	public HelloWorld() {
		System.out.println("构造方法生成了。");
		Calendar.getInstance();
	}

}
