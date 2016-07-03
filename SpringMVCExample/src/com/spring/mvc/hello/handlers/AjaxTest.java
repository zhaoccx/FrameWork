/**
 * 
 */
package com.spring.mvc.hello.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhaocc
 *
 */
@RequestMapping("springajax")
@Controller
public class AjaxTest {
	// private final static String SUCCESS = "success";

	@RequestMapping(value = "/ajaxget", method = RequestMethod.POST)
	@ResponseBody
	public String showAjax() {
		System.out.println("ssssssssssssssssssssssssss");
		System.out.println("ssssssssssssssssssssssssss");
		System.out.println("ssssssssssssssssssssssssss");
		System.out.println("ssssssssssssssssssssssssss");
		System.out.println("ssssssssssssssssssssssssss");
		System.out.println("ssssssssssssssssssssssssss");
		return "ok";
	}

}
