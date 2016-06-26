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
import org.springframework.stereotype.Component;

/**
 * @author zhaocc
 *
 */
@Aspect
@Component
public class LoggingAspect {

	@Before("execution(public double com.spring.aop.cala.IArch.*(..))")
	public void beforeMethed(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("before " + name + " methed" + list);
	}

	@After("execution(public double com.spring.aop.cala.IArch.*(..))")
	public void afterMethed(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("after " + name + " methed" + list);
	}

	@AfterReturning(value = "execution(public double com.spring.aop.cala.IArch.*(..))", returning = "result")
	public void afterMethedReturning(JoinPoint joinPoint, Object result) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("after return  " + name + " methed" + list + "result " + result);
	}

	@AfterThrowing(value = "execution(public double com.spring.aop.cala.IArch.*(..))", throwing = "exception")
	public void throwException(JoinPoint joinPoint, Exception exception) {
		String name = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("after return  " + name + " methed" + list + " exception " + exception);
	}

	@Around("execution(public double com.spring.aop.cala.IArch.*(..))")
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
