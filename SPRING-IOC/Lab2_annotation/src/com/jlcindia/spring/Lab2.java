package com.jlcindia.spring;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.*;


public class Lab2 {
public static void main(String args[]) {
	
ApplicationContext ctx=new AnnotationConfigApplicationContext(JLCConfig.class);

System.out.println("spring container is ready");
System.out.println("------------------------");

Hello h=(Hello)ctx.getBean("hello");
h.show();
	
}
}
