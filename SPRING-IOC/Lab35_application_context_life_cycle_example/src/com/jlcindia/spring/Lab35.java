package com.jlcindia.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab35 {

	
	public static void main(String args[]) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		System.out.println("spring containe is ready");
		Hello hello=(Hello)ctx.getBean("HELLO");
		hello.show();
		
		System.out.println("--------------------");
		System.out.println("Sprinng container going to shutdown ");
		
		ctx.registerShutdownHook();
		
		
		
	}
	
}
