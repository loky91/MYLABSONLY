package com.jlcindia.spring;

import org.springframework.context.annotation.*;

public class JLCConfig {

	@Bean
	@Scope("singleton")
	@Lazy(true)
	public Hello hello() {
		
		return new Hello();
	}
	
	
}
