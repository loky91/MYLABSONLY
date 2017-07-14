package com.jlcindia.spring;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.*;

public class Lab38 {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JlcConfig.class);
		TestBean tb=(TestBean)ctx.getBean("test");
		tb.show();
	}

}
