package com.dragontalker.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class MathImpl implements Math {

	@Override
	public double add(double i, double j) {
		double result = i + j;
		return result;
	}

	@Override
	public double sub(double i, double j) {
		double result = i - j;
		return result;
	}

	@Override
	public double mul(double i, double j) {
		double result = i * j;
		return result;
	}

	@Override
	public double div(double i, double j) {
		double result = i / j;
		return result;
	}

}
