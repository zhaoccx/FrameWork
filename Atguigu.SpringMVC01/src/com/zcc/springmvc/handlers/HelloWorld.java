package com.zcc.springmvc.handlers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	@RequestMapping("/helloworld")
	public String hello() {
		System.out.println("Hello World" + new Date().toString());
		return "success";
	}
}
