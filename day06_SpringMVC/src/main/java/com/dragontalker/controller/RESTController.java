package com.dragontalker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RESTController {

	@RequestMapping(value = "/testREST/{id}", method = RequestMethod.GET)
	public String testGetREST(@PathVariable Integer id) {
		
		System.out.println(">> GET: id=" + id);
		return "test";
	}
	
	@RequestMapping(value = "/testREST", method = RequestMethod.POST)
	public String testPostREST() {
		
		System.out.println(">> POST");
		return "test";
	}
	
	@RequestMapping(value = "/testREST", method = RequestMethod.PUT)
	public String testPutREST() {
		
		System.out.println(">> PUT");
		return "test";
	}
	
	@RequestMapping(value = "/testREST/{id}", method = RequestMethod.DELETE)
	public String testPutREST(@PathVariable Integer id) {
		
		System.out.println(">> DELETE: id=" + id);
		return "test";
	}
	
	
}
