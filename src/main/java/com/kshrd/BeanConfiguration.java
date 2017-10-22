package com.kshrd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public HelloWorldService hello(){
		return new HelloWorldService();
	}
	
}
