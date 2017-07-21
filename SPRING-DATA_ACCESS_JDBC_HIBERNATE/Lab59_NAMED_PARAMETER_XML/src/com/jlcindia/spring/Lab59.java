package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab59 {

	public static void main(String args[]) {
		
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		//1.ADD CUstomer
		CustomerTO cto=new CustomerTO(310,"manish","manish@jlc",999,"blore");
		cdao.addCustomer(cto);
		
		
		//2.updateCUstomer
		CustomerTO cto1=new CustomerTO(101,"manish","manish@jlc",999,"blore");
		cdao.updateCustomer(cto1);
		
		
		//3.getCustomerByCid
		CustomerTO cto2=cdao.getCustomerByCid(101);
		System.out.println(cto2);
		
		
		
	}
	
}
