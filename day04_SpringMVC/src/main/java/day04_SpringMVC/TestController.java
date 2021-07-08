package day04_SpringMVC;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {

	/**
	 * 假设: http://localhost:8080/day04_SpringMVC/hello
	 */
	public String hello() {
		
		System.out.println("Hello world!");
		
		return "hello";
	}
}
