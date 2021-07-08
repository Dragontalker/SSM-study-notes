package com.dragontalker.spring.aop;

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
	@Before(value = "execution(public double com.dragontalker.spring.aop.MathImpl.add(double, double))")
	public void beforeMethod() {
		System.out.println(">> 方法执行之前...");
	}
}
