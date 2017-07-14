package com.jlcindia.spring;

import org.springframework.context.annotation.*;

@Configuration
public class JlcConfig {

	@Bean
	public Hello hello() {
		
		Hello h=new Hello();
		return h;
		
	}
	
	
	@Bean
	public B createB() {
		return new B(99,"Hai guyz");
		
	}
	
	
}
