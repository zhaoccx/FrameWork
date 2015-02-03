package com.zcc.springmvc.handlers;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.zcc.springmvc.entites.Person;

//@SessionAttributes(value = { "time" }, types = { String.class, Person.class })
@RequestMapping("/springmvc")
@Controller
public class RequestMvcTest {

	private static String SUCCESS = "success";

	@ModelAttribute
	public void getPerson(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {
		if (id != null) {
			Person per = new Person(1, "Tossssssss", "123456", "email.@163.com", 450);
			System.out.println(per);
			map.put("person", per);
		}
	}

	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(Person per) {
		System.out.println("update :" + per);
		return SUCCESS;
	}

	@RequestMapping("testSessionAttributes")
	public String testSessionAttributes(Map<String, Object> map) {
		map.put("time", new Date());
		map.put("names", Arrays.asList("Tom", "san", "snnnnnnn"));
		map.put("user", new Person("Tomes", "123456", "tom@hotmsil.com", 45));
		return SUCCESS;
	}

	@RequestMapping("testMap")
	public String testMap(Map<String, Object> map) {
		System.out.println(map.getClass().getName());
		map.put("names", Arrays.asList("Tom", "san", "snnnnnnn"));
		return SUCCESS;
	}

	@RequestMapping("testModelAndView")
	public ModelAndView testModelAndView() {
		String viewName = SUCCESS;
		ModelAndView mv = new ModelAndView(viewName);
		mv.addObject("time", new Date());
		return mv;
	}

	@RequestMapping("testServletAPIout")
	public void testServletAPIOut(HttpServletRequest request, HttpServletResponse response, Writer writer) throws IOException {
		System.out.println("testServletAPI : " + request + ", " + response + ", " + writer);
		writer.write("success OK");
	}

	@RequestMapping("testServletAPI")
	public String testServletAPI(HttpServletRequest request, HttpServletResponse response, Writer writer) {
		System.out.println("testServletAPI : " + request + ", " + response + ", " + writer);
		return SUCCESS;
	}

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
