package com.beanpost.helper;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Bean implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean.postProcessBeforeInitialization()");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		ObjectTracker.increment();
		System.out.println("Bean.postProcessAfterInitialization()");
		return bean;
	}

	
}
