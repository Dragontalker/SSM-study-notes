package com.dragontalker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	/**
	 * View类型:
	 * InternalResourceView： 转发视图
	 * JstlView： 转发视图
	 * RedirectView： 重定向视图
	 */
	@RequestMapping("/test")
	public String test() {
		
		return "redirect:/index.jsp";
	}
}
