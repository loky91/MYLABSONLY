package com.jlcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.jlcindia.spring"})
public class JlcConfig {

	@Bean(name="jlc")
	public JLCManager getManager() {
		
		return new JLCManager();
	}
	
	
}
