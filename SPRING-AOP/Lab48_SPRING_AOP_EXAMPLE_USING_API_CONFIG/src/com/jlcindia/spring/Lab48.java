package com.jlcindia.spring;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Lab48 {

	public static void main(String args[]) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		System.out.println("using target object");
		
		CustomerService cst=(CustomerService)ctx.getBean("csTarget");
		cst.addCustomer();
		cst.updateCustomer();
		
		System.out.println("------------------------");
		AccountService ast=(AccountService)ctx.getBean("asTarget");
		ast.myDeposit();
		ast.getBal();
		
		
		try {
			ast.myWithdraw();
			
			
		}catch(Exception e) {
			
			System.out.println("---sorry--");
		}
		
		System.out.println("------------------------");
		System.out.println("USING PROXY OBJECT");
		
		
		CustomerService csp=(CustomerService)ctx.getBean("csProxy");
		csp.addCustomer();
		csp.updateCustomer();
		
		System.out.println("------------------------");	
		AccountService asp=(AccountService)ctx.getBean("asProxy");
		asp.myDeposit();
		asp.getBal();
		
		try {
			
			asp.myWithdraw();
		}catch(Exception e) {
			System.out.println("---sorry-------");
			
		}
		
		
	}
	
	
}
