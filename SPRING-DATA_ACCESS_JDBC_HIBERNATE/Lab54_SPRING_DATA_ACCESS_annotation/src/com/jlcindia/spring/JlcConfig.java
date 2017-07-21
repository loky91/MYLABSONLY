package com.jlcindia.spring;

import javax.sql.*;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JlcConfig {

	@Bean
	public DataSource mysqlDS() {
		
		
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
		
	}
	
	
	@Bean(name="ts")
	public TestService testService() {
		return new TestService();
		
	}
	
	
	
}
