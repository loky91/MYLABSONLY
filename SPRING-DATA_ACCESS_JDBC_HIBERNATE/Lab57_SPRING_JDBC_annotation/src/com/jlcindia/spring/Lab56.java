package com.jlcindia.spring;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Lab56 {

	public static void main(String args[]) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JlcConfig.class);
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		
		
		//1. add customer
		
		CustomerTO cto=new CustomerTO(203,"srini","sri@jlc.com",9999,"blore");
		cdao.addCustomer(cto);
		
		//2. update customer
		
		CustomerTO cto1=new CustomerTO(106,"vas","vas@jlc.com",8888,"blore");
		cdao.updateCustomer(cto1);
		
		
		//3  delete customer
		
		cdao.deleteCustomer(101);
		System.out.println("check your dB");
	}
	
}
