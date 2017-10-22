package com.kshrd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	/*
	//TODO: Initialize Spring Application with XML-base configuration
	public static void main(String[] args) {
		
		// Load bean(object) from XML Configuration File to IoC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Call bean from container to use
		HelloWorldService hello = ctx.getBean(HelloWorldService.class);
		
		hello.sayHello();
		
		// close container
		ctx.close();
	}
	*/
	
	//TODO: Initialize Spring Application using Java-based configuration
	public static void main(String[] args) {
		
		// Load bean(object) from Java Configuration Class to IoC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// Call bean from container to use
		HelloWorldService hello = ctx.getBean(HelloWorldService.class);
		
		hello.sayHello();
		
		// close container
		ctx.close();
	}
	
	
	
	
}
