package com.dragontalker.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class TestHandler {

	public void test() {
		System.out.println(">> 测试切入点表达式...");
	}
}
