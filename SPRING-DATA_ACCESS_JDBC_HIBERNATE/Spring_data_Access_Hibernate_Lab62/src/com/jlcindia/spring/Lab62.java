package com.jlcindia.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab62 {

	
public static void main(String args[]) {
		
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		
		



	
	
	
	
}
}