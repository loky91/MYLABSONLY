package com.jlcindia.spring;

import javax.annotation.*;

public class TestBean {


	
	@Resource(name="mysqlDS")
	DataSource mysqlDataSource;
	
	public void show() {
		
	
		System.out.println(mysqlDataSource);
	}
	
	
	
	
}
