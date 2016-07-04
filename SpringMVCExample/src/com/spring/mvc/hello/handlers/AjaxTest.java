/**
 * 
 */
package com.spring.mvc.hello.handlers;

//import com.alibaba.fastjson.JSON;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.mvc.entity.User;

/**
 * @author zhaocc
 *
 */
@RequestMapping("/springajax")
@Controller
public class AjaxTest {
	// private final static String SUCCESS = "success";

	@RequestMapping(value = "/ajaxget-{id}", method = RequestMethod.GET)
	@ResponseBody
	public String showAjax(HttpServletRequest request, HttpServletResponse response, @PathVariable(value = "id") Object object) {
		System.out.println("ssssssssssssssssssssssssss");
		System.out.println("ssssssssssssssssssssssssss");
		System.out.println("ssssssssssssssssssssssssss");
		System.out.println("ssssssssssssssssssssssssss");
		System.out.println("ssssssssssssssssssssssssss");
		System.out.println("ssssssssssssssssssssssssss");

		PrintWriter printWriter = null;
		try {
			printWriter = response.getWriter();
			printWriter.print(object + "ssssssss" + new Date());
		} catch (IOException ex) {
			Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (null != printWriter) {
				printWriter.flush();
				printWriter.close();
			}
		}

		return null;
	}

	/**
	 * ajax请求不需要返回页面，只需要得到response中的数据即可，所以方法签名为void即可
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/ajaxpost", method = RequestMethod.POST)
	public void ajaxDatas(HttpServletRequest request, HttpServletResponse response, User user) {
		System.out.println("sssssssssssssssssss");
		System.out.println("sssssssssssssssssss");
		System.out.println("sssssssssssssssssss");
		System.out.println("sssssssssssssssssss");
		String jsonResult = getJSONString(request);
		renderData(response, jsonResult);
	}

	private String getJSONString(HttpServletRequest request) {
		// 故意构造一个数组，使返回的数据为json数组，数据更复杂些
		List<Map<String, Object>> datas = new ArrayList<>(5);
		Map<String, Object> map1 = new HashMap<>(10);
		// 可以获得ajax请求中的参数
		map1.put("a", request.getParameter("username"));
		map1.put("b", request.getParameter("password"));
		map1.put("c", request.getParameter("email"));
		map1.put("d", request.getParameter("age"));
		datas.add(map1);
		// 故意构造一个数组，使返回的数据为json数组，数据更复杂些
		Map<String, Object> map2 = new HashMap<>(10);
		map2.put("a", "11");
		map2.put("b", "22");
		map2.put("c", "33");
		datas.add(map2);

		// String jsonResult = "{['a':'" + request.getParameter("a") + "','b':'"
		// + request.getParameter("b") + "','c':'" + request.getParameter("c") +
		// "','d':'" + request.getParameter("age") +
		// "'],['a':'11','b':'22','c':'33']}";
		// datas.toString();
		// String jsonResult = JSON.toJSONString(datas);
		return datas.toString();
	}

	/**
	 * 通过PrintWriter将响应数据写入response，ajax可以接受到这个数据
	 * 
	 * @param response
	 * @param data
	 */
	private void renderData(HttpServletResponse response, String data) {
		PrintWriter printWriter = null;
		try {
			response.setHeader("Content-type", "text/html;charset=UTF-8");
			// 这句话的意思，是告诉servlet用UTF-8转码，而不是用默认的ISO8859
			response.setCharacterEncoding("UTF-8");
			printWriter = response.getWriter();
			printWriter.print(data);
		} catch (IOException ex) {
			Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (null != printWriter) {
				printWriter.flush();
				printWriter.close();
			}
		}
	}

}
