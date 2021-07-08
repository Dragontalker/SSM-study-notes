package com.dragontalker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	/**
	 * @RequestMapping: 设置请求映射, 把请求和控制层中的方法设置映射关系
	 * 当请求路径和@RequestMapping的value属性值一致时, 则该注解所标注的方法, 即为处理请求的方法
	 * method: 用来设置请求方式, 只有客户端发送请求方式的方式和method的值一致, 才能处理请求
	 * 请求方式： GET(查询) POST(添加) PUT(修改) DELETE(删除)
	 * params: 用来设置请求参数, 支持表达式
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET, params= { "username", "!age" })
	public String testGET() {
		
		return "test";
	}
	
	/*
	 * SpringMVC支持Ant方式的请求路径
	 * 在Ant中, 有3种匹配符
	 * *: 任意字符
	 * ?: 任意一个字符
	 * **: 任意多层目录
	 */
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String testPOST() {
		
		return "test";
	}
	
	/**
	 * 以前: http://localhost:8080/day05_SpringMVC?id=1001&username=admin
	 * 现在: http://localhost:8080/day05_SpringMVC/1001/admin
	 */
	@RequestMapping("testREST/{id}/{username}")
	public String testREST(@PathVariable("id") Integer id, 
			@PathVariable("username") String username) {
		
		System.out.println("id: " + id + ", username: " + username);
		
		return "test";
	}
}
