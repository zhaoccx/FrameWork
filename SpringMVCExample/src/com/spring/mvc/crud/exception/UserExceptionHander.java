/**
 * 
 */
package com.spring.mvc.crud.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhaocc
 *
 */
@ControllerAdvice
public class UserExceptionHander {
	@ExceptionHandler({ Exception.class })
	public ModelAndView viewErrorPage(Exception exception) {
		System.out.println(exception);
		ModelAndView vModelAndView = new ModelAndView("error");
		vModelAndView.addObject("ex", exception);
		return vModelAndView;
	}
}
