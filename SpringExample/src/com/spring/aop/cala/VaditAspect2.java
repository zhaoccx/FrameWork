/**
 * 
 */
package com.spring.aop.cala;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;

/**
 * @author zhaocc
 *
 */
public class VaditAspect2 {

	public void beforeMethed(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("val       alsssssssssbefore " + name + " methed" + list);
	}

}
