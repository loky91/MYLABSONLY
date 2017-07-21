package com.jlcindia.spring;

import java.sql.*;
import org.springframework.jdbc.core.*;

public class CustomerRowMapper implements RowMapper<CustomerTO> {

	
	public CustomerTO mapRow(ResultSet rs, int rn) throws SQLException {
	CustomerTO cto=new CustomerTO();
	
	cto.setCid(rs.getInt(1));
	cto.setName(rs.getString(2));
	cto.setEmail(rs.getString(3));
	cto.setPhone(rs.getLong(4));
	cto.setCity(rs.getString(5));
	
		return cto;
	}
	
}
