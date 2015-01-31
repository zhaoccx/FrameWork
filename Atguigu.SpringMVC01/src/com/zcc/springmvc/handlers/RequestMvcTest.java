package com.zcc.springmvc.handlers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/springmvc")
@Controller
public class RequestMvcTest {

	private static String SECCESS = "success";

	@RequestMapping("/mymvc")
	public String requestTest() {
		System.out.println("requestTest" + new Date().toString());
		return SECCESS;
	}

	@RequestMapping(value = "myMethed", method = RequestMethod.POST)
	public String requestMethed() {
		System.out.println("requestMethed" + new Date().toString());
		return SECCESS;
	}
}
