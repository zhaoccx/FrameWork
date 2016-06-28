/**
 * 
 */
package com.spring.aop.cala;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhaocc
 *
 */
@Order(5)
@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(public double com.spring.aop.cala.IArch.*(..))")
	public void executionAspect() {

	}

	@Before("executionAspect()")
	public void beforeMethed(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("before " + name + " methed" + list);
	}

	@After("executionAspect()")
	public void afterMethed(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("after " + name + " methed" + list);
	}

	@AfterReturning(value = "executionAspect()", returning = "result")
	public void afterMethedReturning(JoinPoint joinPoint, Object result) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("after return  " + name + " methed" + list + "result " + result);
	}

	@AfterThrowing(value = "executionAspect()", throwing = "exception")
	public void throwException(JoinPoint joinPoint, Exception exception) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("after return  " + name + " methed" + list + " exception " + exception);
	}

	@Around("executionAspect()")
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
