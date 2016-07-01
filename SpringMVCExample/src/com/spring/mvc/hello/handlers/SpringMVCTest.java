/**
 * 
 */
package com.spring.mvc.hello.handlers;

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
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.entity.Address;
import com.spring.mvc.entity.User;
import com.spring.mvc.entity.User2;

/**
 * @author zhaocc
 *
 */
// @SessionAttributes(value = { "time", "ssss" }, types = { User.class })
@RequestMapping("springmvc")
@Controller
public class SpringMVCTest {

	private final static String SUCCESS = "success";

	////////////////////////////////
	@RequestMapping("testModelAttributes")
	public String testModelAttributes(User2 user2) {
		System.out.println(user2);
		return SUCCESS;
	}

	@ModelAttribute()
	public void getUser2(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {
		System.err.println("modelAttribute run ..............");
		if (id != null) {
			System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssssssss");
			map.put("user2", new User2("ss", "1111", "sss", 52, null, id));
		}
	}

	//////////////////////////////
	@RequestMapping("testSessionAttribute")
	public String testSessionAttribute(Map<String, Object> map) {
		System.out.println(map.getClass().getName());
		map.put("time", Arrays.asList("Tom", "Jom"));
		map.put("user", new User("aa", "bb", "cc", 45, new Address("ee", "fff", "ggg", "hhh", "III")));
		return SUCCESS;
	}

	@RequestMapping("testMap")
	public String testMap(Map<String, Object> map) {
		System.out.println(map.getClass().getName());
		map.put("time", Arrays.asList("Tom", "Jom"));
		return SUCCESS;
	}

	@RequestMapping("testModelAndViews")
	public ModelAndView testModelAndViews(User user) {

		ModelAndView view = new ModelAndView(SUCCESS);
		user.setEmail("sssssssssssssssssssssss");
		user.getAddress().setStreet("中国");
		view.addObject("user", user);
		return view;

	}

	@RequestMapping("testModelAndView")
	public ModelAndView testModelAndView() {

		ModelAndView view = new ModelAndView(SUCCESS);
		view.addObject("time", new Date());
		return view;

	}

	@RequestMapping("testServlets")
	public void testServlets(HttpServletRequest request, HttpServletResponse response, Writer out) throws IOException {
		System.out.println("testServlet" + request + "," + response);
		out.write("success pagesss");
	}

	@RequestMapping("testServlet")
	public String testServlet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("testServlet" + request + "," + response);
		return SUCCESS;
	}

	@RequestMapping("testPOJO")
	public String testPOJO(User user) {
		System.out.println(user);
		return SUCCESS;
	}

	@RequestMapping("testCookieValue")
	public String testCookieValue(@CookieValue(value = "JSESSIONID") String JSESSIONID) {
		System.out.println("testCookieValue :JSESSIONID:" + JSESSIONID);
		return SUCCESS;
	}

	@RequestMapping("testRequestheader")
	public String testRequestheader(@RequestHeader(value = "Accept-Language") String heString) {
		System.out.println("testRequestheader" + heString);
		return SUCCESS;
	}

	@RequestMapping("testRequestParams")
	public String testRequestParams(@RequestParam(value = "username") String name, @RequestParam(value = "age", required = false, defaultValue = "0") Integer age) {
		System.out.println("testRequestParams  " + name + "   " + age);

		return SUCCESS;
	}

	@RequestMapping(value = "testRest/{id}", method = RequestMethod.PUT)
	public String testRestMethedPut(@PathVariable(value = "id") Integer integer) {
		System.out.println("testRest Put " + integer);
		return SUCCESS;
	}

	@RequestMapping(value = "testRest/{id}", method = RequestMethod.DELETE)
	public String testRestMethedDelete(@PathVariable(value = "id") Integer integer) {
		System.out.println("testRest Delete " + integer);
		return SUCCESS;
	}

	@RequestMapping(value = "testRest")
	public String testRestMethed() {
		System.out.println("testRest post ");
		return SUCCESS;
	}

	@RequestMapping(value = "testRest/{id}")
	public String testRestMethed(@PathVariable(value = "id") Integer integer) {
		System.out.println("testRest get " + integer);
		return SUCCESS;
	}

	@RequestMapping("testPathAreable/{tst}/*/{sss}")
	public String testPathAreable(@PathVariable(value = "tst") Integer tInteger, @PathVariable(value = "sss") String string) {
		System.out.println("testPathAreable " + tInteger + "ssssss" + string);
		return SUCCESS;
	}

	@RequestMapping("testAntPath/*/abc")
	public String testAntPath() {
		System.out.println("testAntPath....");
		return SUCCESS;
	}

	// @RequestMapping(value = "testParamsAndHead", params = { "username",
	// "age!=10" }, headers = { "User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64;
	// x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103
	// Safari/537.36" })
	@RequestMapping(value = "testParamsAndHead", params = { "username", "age!=10" })
	public String testParamsAndHead() {
		System.out.println("testParamsAndHead...........");
		return SUCCESS;
	}

	@RequestMapping("/testRequestMVCMapping")
	public String testRequestMVCMapping() {
		System.out.println("testRequestMVCMapping....");
		return SUCCESS;
	}

	@RequestMapping(value = "/testMethed", method = RequestMethod.POST)
	public String testMethed() {
		System.out.println("testMethed....");
		return SUCCESS;
	}
}
