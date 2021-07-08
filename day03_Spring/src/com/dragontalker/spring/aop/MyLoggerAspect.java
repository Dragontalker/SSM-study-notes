package com.dragontalker.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // 标注当前类为切面
public class MyLoggerAspect {

	/**
	 * @Before: 将方法指定为前置通知
	 * 必须设置value, 其值为切入点表达式
	 */
	@Before(value = "execution(* com.dragontalker.spring.aop.*.*(..))")
	public void beforeMethod(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		String methodName = joinPoint.getSignature().getName();
		System.out.println(">> Method Name: " + methodName);
		System.out.println(">> Arugments: " + Arrays.toString(args));
	}
	
	/**
	 * @After: 将方法标注为后置通知
	 * 后置通知: 作用于方法的finally语句块, 即不管有没有异常都会执行
	 */
	@After(value = "execution(* com.dragontalker.spring.aop.*.*(..))")
	public void afterMethod() {
		System.out.println(">> afterMethod() called...");
	}
	
	@AfterReturning(value = "execution(* com.dragontalker.spring.aop.*.*(..))")
	public void afterReturning() {
		System.out.println(">> afterReturning() called...");
	}
}
