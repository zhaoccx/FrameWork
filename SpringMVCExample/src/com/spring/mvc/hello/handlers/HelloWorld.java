/**
 * 
 */
package com.spring.mvc.hello.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaocc
 *
 */
@Controller
public class HelloWorld {

	@RequestMapping("/helloworld")
	public String hello() {
		System.out.println("hello world");
		return "success";
	}
}
