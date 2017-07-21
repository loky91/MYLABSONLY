package com.jlcindia.spring;

import java.sql.*;
import javax.annotation.*;
import javax.sql.*;

public class TestService {


	
	@Resource(name="mysqlDS")
	private DataSource mysqlDS;
	
	public void showMySQLInfo(){
		
		try {
			
			Connection mycon=mysqlDS.getConnection();
			DatabaseMetaData mydbmd=mycon.getMetaData();
			System.out.println(mydbmd.getDatabaseProductName());
			System.out.println(mydbmd.getDefaultTransactionIsolation());
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	
}