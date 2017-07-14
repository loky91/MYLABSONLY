package com.jlcindia.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab44 {

	
	
	public static void main(String args[]) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		ctx.start();
		JLCManager jlc=(JLCManager)ctx.getBean("jlc");
		Batch b=new Batch("B-24","28-apr-2010","6-7",150);
		
		jlc.addBatch(b);
Workshop ws=new Workshop("Web Services",5000,99);
jlc.addWorkshop(ws);		
	}
}
