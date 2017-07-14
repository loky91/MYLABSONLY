package com.jlcindia.spring;

import org.springframework.context.*;

import org.springframework.context.support.*;


public class Lab1 {
public static void main(String args[]) {
	
ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");

System.out.println("spring container is ready");
System.out.println("------------------------");

Hello h=(Hello)ctx.getBean("hello");
h.show();
	
}
}
