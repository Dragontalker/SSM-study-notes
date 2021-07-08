package com.dragontalker.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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
	
	@After(value = "exection()")
	public void afterMethod() {
		
	}
}
