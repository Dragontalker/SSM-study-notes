package day03_Spring.spring.aop;

import org.springframework.stereotype.Component;

@Component
public interface Math {

	double add(double i, double j);
	
	double sub(double i, double j);
	
	double mul(double i, double j);
	
	double div(double i, double j);
}
