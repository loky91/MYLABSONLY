package com.jlcindia.spring;

import org.springframework.context.*;
import org.springframework.context.support.*;


public class Lab18 {

	public static void main(String args[]) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		Hello  hello=(Hello)ctx.getBean("hello");
		
		hello.show();
	}
	
}
