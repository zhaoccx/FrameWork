/**
 * 
 */
package com.spring.mvc;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

/**
 * @author zhaocc
 *
 */
@Component
public class MyView implements View {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.View#getContentType()
	 */
	@Override
	public String getContentType() {
		return "text/html";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.View#render(java.util.Map,
	 * javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.getWriter().print("my view" + new Date());
	}

}
