package cn.javass.chapter2.web.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// 1、收集参数、验证参数
		// 2、绑定参数到命令对象
		// 3、将命令对象传入业务对象进行业务处理
		// 4、选择下一个页面
		ModelAndView mv = new ModelAndView();
		// 添加模型数据可以是任意的POJO对象
		// ModelMap modelMap = new ModelMap();
		Collection<String> objects = new ArrayList<String>();
		objects.add("趙 常 春");
		objects.add("abc");
		Student student = new Student(34, "zhao", new Date(), 175, 56);
		// modelMap.addAllObjects(objects);
		// modelMap.addAllAttributes(student);
		// mv.addAllObjects("",modelMap);
		// mv.addObject(objects);
		mv.addObject("zhao", student);
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("helloo");
		return mv;
	}
}
