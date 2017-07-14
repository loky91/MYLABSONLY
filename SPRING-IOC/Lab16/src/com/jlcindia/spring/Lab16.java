package com.jlcindia.spring;

import org.springframework.context.*;
import org.springframework.context.annotation.*;


public class Lab16 {

	public static void main(String args[]) {
		
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JlcConfig.class);
		Hello  hello=(Hello)ctx.getBean("hello");
		
		hello.show();
	}
	
}
