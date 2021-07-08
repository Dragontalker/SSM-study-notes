package com.dragontalker.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	/**
	 * 假设: http://localhost:8080/day04_SpringMVC/hello
	 */
	@RequestMapping("hello")
	public String helloWorld(String username, String password) {
		
		System.out.println(username);
		System.out.println(password);
		
		System.out.println("Hello world!");
		
		return "hello";
	}
}
