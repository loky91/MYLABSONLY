package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO{

	@Autowired
	JdbcTemplate jdbcTemp;
	
	@Override
	public void addCustomer(CustomerTO cto) {
	String sql="insert into customers5 values(?,?,?,?,?)";
	jdbcTemp.update(sql,cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity());
		
	}
	
	
	@Override
	public void deleteCustomer(int cid) {
	String sql="delete from customers5 where cid=?";
	jdbcTemp.update(sql,cid);
		
	}
	
	@Override
	public void updateCustomer(CustomerTO cto) {
		String sql="update customers5 set cname=?,email=?,phone=?,city=? where cid=?";
		jdbcTemp.update(sql,cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getCid());
		
	}
}
