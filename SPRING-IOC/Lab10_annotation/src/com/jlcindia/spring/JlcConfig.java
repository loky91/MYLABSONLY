package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;

@Configuration
public class JlcConfig {

	@Bean(name="aobj")
	public A createA() {
		
		A aobj=new A();
		aobj.setA(10);
		aobj.setMsg("AAA");
		return aobj;
	}
	
	
	
	@Bean(autowire=Autowire.BY_NAME)
	public Hello hello() {
		return new Hello();
		
	}
	@Bean(name="bobj")
	public B bo() {
		return new B(20,"BBB");
		
	}
}
