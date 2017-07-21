package com.jlcindia.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab64 {

	
public static void main(String args[]) {
		
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		
//		
//		//1.ADD CUstomer
//		CustomerTO cto=new CustomerTO(119,"shv","shv@jlc",77,"lcknow");
//		cdao.addCustomers(cto);
		
		//1.getAllCustomers
		System.out.println("getAllCustomers");
	
		
		List<CustomerTO> list=cdao.getAllCustomers();
		for(CustomerTO ct:list) {
			
			System.out.println(ct.getCid()+"\t"+ct.getName());
			
		}
				
				
		//2.getCustomerByEmail

		System.out.println("getCustomersByEmail");
		String cto=cdao.getCustomerByEmail("shv@jlc");
		System.out.println(cto);
	
}
}