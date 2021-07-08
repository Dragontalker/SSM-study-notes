package com.dragontalker.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {

	@Before(value = "execution(* com.dragontalker.spring.aop.*.*(..))")
	public void before() {
		System.out.println(">> before() from TestAspect()....");
	}
}
