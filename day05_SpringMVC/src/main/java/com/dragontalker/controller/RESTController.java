package com.dragontalker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RESTController {

	@RequestMapping(value = "/testREST/{id}", method = RequestMethod.GET)
	public String testREST(@PathVariable Integer id) {
		
		System.out.println(">> GET: id=" + id);
		return "test";
	}
	
}
