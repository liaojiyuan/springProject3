package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {	
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		ServiceA serviceA=context.getBean("serviceA",ServiceA.class);
		serviceA.addAccount("some account");
		ServiceB serviceB=context.getBean("serviceB",ServiceB.class);
		serviceB.deposit();
	}

}
