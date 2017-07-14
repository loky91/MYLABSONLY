package com.jlcindia.spring;

import org.springframework.context.annotation.*;


@Configuration
public class JLCConfig {

	@Bean
	@Scope("prototype")
	public Hello hello() {
		return new Hello();
		
	}
	
}
