/**
 * 
 */
package com.zc.springone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaocc
 *
 */
@Controller
public class SpringMVCTestOne {

	@RequestMapping("/oneOne")
	public String oneTestMethed() {
		System.out.println("OK");
		return "success";
	}

	@RequestMapping("/oneTwo")
	public String twoTestMethod() {
		System.out.println("Two");
		return "ok";
	}
}
