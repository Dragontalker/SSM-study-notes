package com.dragontalker.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	/**
	 * @AfterReturning: 将方法标注为返回通知
	 * @param joinPoint
	 * @param result
	 * 返回通知: 作用于方法执行之后
	 * 可通过returning设置接收方法返回值的变量名
	 * 要想在方法中使用, 必须在方法的形参中设置和变量名相同的形参
	 */
	@AfterReturning(value = "execution(* com.dragontalker.spring.aop.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		
		System.out.println(">> afterReturning() called...");
		System.out.println(">> result = " + result);
	}
	
	/**
	 * @AfterThrowing: 将方法标注为异常通知（Exception)
	 * @param exception
	 * 异常通知（Exception): 作用于当方法抛出异常时
	 * 可通过throwing设置接收方法返回的异常信息
	 * 在参数列表中可通过具体的异常类型, 来对指定的异常信息进行操作
	 */
	@AfterThrowing(value = "execution(* com.dragontalker.spring.aop.*.*(..))", throwing="exception")
	public void afterThrowing(Exception exception) {
		System.out.println(">> afterThrowing() called... the Exception is: " + exception);
	}
	
	@Around(value = "execution(* com.dragontalker.spring.aop.*.*(..))")
	public void aroundMethod(ProceedingJoinPoint joinPoint) {
		
		try {
			// 前置通知
			System.out.println("前置通知");
			joinPoint.proceed(); // 执行方法
			// 返回通知
			System.out.println("返回通知");
		} catch (Throwable e) {
			e.printStackTrace();
			// 异常通知
			System.out.println("异常通知");
		} finally {
			// 后置通知
			System.out.println("后置通知");
		}
	}
}
