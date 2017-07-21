package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab60 {

	public static void main(String args[]) {
		
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		//1.ADD CUstomer
		CustomerTO cto=new CustomerTO(100,"yogesh","yogi@jlc",890,"blore");
		cdao.addCustomer(cto);
	
		
		
	
		
		
		
	}
	
}
