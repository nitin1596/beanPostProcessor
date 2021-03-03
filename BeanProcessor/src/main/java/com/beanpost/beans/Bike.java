package com.beanpost.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.beanpost.helper.ObjectTracker;

public class Bike implements InitializingBean,DisposableBean,BeanFactoryAware{

	private int no;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
		System.out.println("Bike.setNo()");
	}

	public Bike() {
		System.out.println("Bike.Bike()");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Bike.afterPropertiesSet()");

	}

	public void destroy() throws Exception {
		System.out.println("Bike.destroy()");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bike.setBeanFactory()");
		
	}

}
