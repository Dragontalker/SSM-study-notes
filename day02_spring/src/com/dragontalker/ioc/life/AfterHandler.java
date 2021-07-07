package com.dragontalker.ioc.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AfterHandler implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		return null;
	}

}
