package com.zcc.springmvc.handlers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zcc.springmvc.entites.Person;

@RequestMapping("/springmvc")
@Controller
public class RequestMvcTest {

	private static String SUCCESS = "success";

	@RequestMapping("mymvc")
	public String requestTest() {
		System.out.println("requestTest" + new Date().toString());
		return SUCCESS;
	}

	@RequestMapping(value = "/myMethed", method = RequestMethod.POST)
	public String requestMethed() {
		System.out.println("requestMethed" + new Date().toString());
		return SUCCESS;
	}

	@RequestMapping(value = "/requestParamsAndHandler", params = { "username", "age!=10" }, headers = { "Connection=keep-alive" })
	public String requestParamsAndHandler() {
		System.out.println("requestParamsAndHandler" + new Date().toString());
		return SUCCESS;
	}

	@RequestMapping("testAnt/*/abc")
	public String requestAntTest() {
		System.out.println("requestAntTest" + new Date().toString());
		return SUCCESS;
	}

	@RequestMapping("/requestAviable/{id}/{My}")
	public String requestAviable(@PathVariable("id") Integer intes, @PathVariable("My") String str) {
		System.out.println("requestAviable  " + intes + " sssssssss " + str);
		return SUCCESS;
	}

	@RequestMapping(value = "requestRest/{My}", method = RequestMethod.GET)
	public String testRests(@PathVariable("My") String str) {
		System.out.println("testRests " + str);
		return SUCCESS;
	}

	@RequestMapping(value = "requestRest/{My}", method = RequestMethod.POST)
	public String testRests() {
		System.out.println("testRests Post");
		return SUCCESS;
	}

	@RequestMapping(value = "requestRest/{My}", method = RequestMethod.DELETE)
	public String testRestsDelete(@PathVariable("My") String str) {
		System.out.println("testRests Delete" + str);
		return SUCCESS;
	}

	@RequestMapping(value = "requestRest/{My}", method = RequestMethod.PUT)
	public String testRestsPut(@PathVariable("My") String str) {
		System.out.println("testRests Put" + str);
		return SUCCESS;
	}

	@RequestMapping(value = "testRequestParam")
	public String testRequestParam(@RequestParam(value = "username", required = false, defaultValue = "My") String un, @RequestParam(value = "age", required = false, defaultValue = "0") int a) {
		System.out.println("testRequestParam username : " + un + ", age :" + a);
		return SUCCESS;

	}

	@RequestMapping(value = "testRequestHeader")
	public String testRequestHealder(@RequestHeader(value = "Accept-Language") String accept, @RequestHeader(value = "User-Agent") String client) {
		System.out.println("RequestHeader Accept-Language is :" + accept + " User-Agent is :" + client);
		return SUCCESS;
	}

	@RequestMapping(value = "testCookieValue")
	public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookvalueid) {
		System.out.println("@CookieValue(value=JSESSIONID) String cookvalueid is " + cookvalueid);
		return SUCCESS;
	}

	@RequestMapping(value = "testPojo")
	public String testPojo(Person person) {
		System.out.println(person);
		return SUCCESS;
	}
}
