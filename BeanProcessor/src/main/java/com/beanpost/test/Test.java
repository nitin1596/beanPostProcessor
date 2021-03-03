package com.beanpost.test;

import java.applet.AppletContext;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.beanpost.helper.Bean;
import com.beanpost.helper.ObjectTracker;

public class Test {
public static void main(String[] args) {
	
	//DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	//BeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	//reader.loadBeanDefinitions(new ClassPathResource("application-context.xml"));
	
	//factory.addBeanPostProcessor(new Bean());
	
	ApplicationContext factory=new ClassPathXmlApplicationContext("application-context.xml");
//	factory.getBean("motor");
	//factory.getBean("bike");
	//factory.getBean("robot");
	
	System.out.println(ObjectTracker.size());
	//not working because of 2nd ioc((ConfigurableBeanFactory)factory).destroySingletons();
}
}
