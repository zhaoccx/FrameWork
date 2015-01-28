package com.zcc.spring.beans;

public class HelloWorld {
	private String name;

	public String getName() {
		System.out.println("getName");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName" + name);
		this.name = name;
	}

	public void hello() {
		System.out.println("hello : " + name);
	}

	public HelloWorld(String name) {
		super();
		this.name = name;
	}

	public HelloWorld() {
		System.out.println("构造方法生成了。");
	}

}
