package com.dragontalker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	/**
	 * @RequestMapping: 设置请求映射, 把请求和控制层中的方法设置映射关系
	 * 当请求路径和@RequestMapping的value属性值一致时, 则该注解所标注的方法, 即为处理请求的方法
	 */
	@RequestMapping("/test")
	public String test() {
		
		return "test";
	}
}
