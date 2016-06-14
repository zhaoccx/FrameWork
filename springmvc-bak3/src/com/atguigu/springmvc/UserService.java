package com.atguigu.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private HelloWorld helloWorld;

	public UserService() {
		System.out.println("UserService Constructor...");
	}

	/**
	 * @return the helloWorld
	 */
	public HelloWorld getHelloWorld() {
		return helloWorld;
	}

	/**
	 * @param helloWorld
	 *            the helloWorld to set
	 */
	public void setHelloWorld(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}
}
