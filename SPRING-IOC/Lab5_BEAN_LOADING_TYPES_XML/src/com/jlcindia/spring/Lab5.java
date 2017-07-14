package com.jlcindia.spring;

import org.springframework.context.*;

import org.springframework.context.support.*;


public class Lab5 {

public static void main (String args[]) {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
	System.out.println("spring container is ready");
	System.out.println("-------------------------");
	
	Hello h1=(Hello)ctx.getBean("hello");
	Hello h2=(Hello)ctx.getBean("hello");
	
	System.out.println(h1==h2);
}	
	
}
