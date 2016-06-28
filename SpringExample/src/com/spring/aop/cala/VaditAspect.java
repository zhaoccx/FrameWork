/**
 * 
 */
package com.spring.aop.cala;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhaocc
 *
 */
@Order(2)
@Aspect
@Component
public class VaditAspect {

	@Before("com.spring.aop.cala.LoggingAspect.executionAspect()")
	public void beforeMethed(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("val       alsssssssssbefore " + name + " methed" + list);
	}

}
