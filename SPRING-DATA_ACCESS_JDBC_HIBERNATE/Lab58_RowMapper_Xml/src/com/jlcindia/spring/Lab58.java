package com.jlcindia.spring;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Lab58 {

	
	public static void main(String args[]) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		
		//1 getCustomerByCid
		System.out.println("getCustomerByCid");
		CustomerTO cto=cdao.getCustomerByCid(103);
		System.out.println(cto);
		
		
		//2 getAll Customers
		
		List<CustomerTO> list=cdao.getAllCustomers();
		for(CustomerTO ct:list)
			System.out.println(ct);
		
		//3 getCustomersByEmail
		System.out.println("getCustomersByEmail");
		cto=cdao.getCustomerByEmail("lok@gmail.com");
		System.out.println(cto);
		
		
	}
	
}
