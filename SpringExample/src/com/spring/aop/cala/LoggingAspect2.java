/**
 * 
 */
package com.spring.aop.cala;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author zhaocc
 *
 */
public class LoggingAspect2 {

	public void executionAspect() {

	}

	public void beforeMethed(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("before " + name + " methed" + list);
	}

	public void afterMethed(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("after " + name + " methed" + list);
	}

	public void afterMethedReturning(JoinPoint joinPoint, Object result) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("after return  " + name + " methed" + list + "result " + result);
	}

	public void throwException(JoinPoint joinPoint, Exception exception) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("after return  " + name + " methed" + list + " exception " + exception);
	}

	public Object aroudMethed(ProceedingJoinPoint proceedingJoinPoint) {
		Object result = null;
		String name = proceedingJoinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(proceedingJoinPoint.getArgs());
		try {
			System.out.println("before " + name + " methed" + list);
			result = proceedingJoinPoint.proceed();
			System.out.println("after " + name + " methed" + list);
		} catch (Throwable e) {
			System.out.println("after return  " + name + " methed" + list + " exception " + e);
		}

		System.out.println("after " + name + " methed" + list);
		return result;

	}
}
