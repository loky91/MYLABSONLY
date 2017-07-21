package com.jlcindia.spring;

import org.springframework.jdbc.core.support.*;
import java.sql.*;
import  org.springframework.jdbc.core.*;

public class JdbcCustomerDAO extends  JdbcDaoSupport implements CustomerDAO{

	public void addCustomer(final CustomerTO cto) {
		PreparedStatementCreator psc=new PreparedStatementCreator() {
			
		
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		PreparedStatement ps=con.prepareStatement("insert into customers values(?,?,?,?,?)");
		ps.setInt(1,cto.getCid());
		ps.setString(2,cto.getName());
		ps.setString(3,cto.getEmail());
		ps.setLong(4,cto.getPhone());
		ps.setString(5,cto.getCity());
		
				return ps;
			}
		};
		
		getJdbcTemplate().update(psc);
	}
	
}
