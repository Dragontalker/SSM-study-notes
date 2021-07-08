package com.dragontalker.spring.aopxml;

import org.springframework.stereotype.Component;

@Component
public class MyLogger {

	public void before() {
		System.out.println(">> before() called...");
	}
}
