package com.jlcindia.spring;


import java.util.*;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.*;

public class JdbcCustomerDAO implements CustomerDAO {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemp;
	
	public void addCustomer(CustomerTO cto) {
		String sql="insert into customers values(:cid,:name,:email,:phone,:city)";
		Map<String,Object> parameters=new HashMap<String,Object>();
		parameters.put("cid",cto.getCid());
		parameters.put("name",cto.getName());
		parameters.put("email",cto.getEmail());
		parameters.put("phone",cto.getPhone());
		parameters.put("city",cto.getCity());
		
		
		namedParameterJdbcTemp.update(sql, parameters);
	}
	
	
	
	public void updateCustomer(CustomerTO cto) {
		String sql="update customers set name=:name,email=:email,phone=:phone,city=:city where cid=:cid";
		Map<String,Object> parameters=new HashMap<String,Object>();
		parameters.put("cid",cto.getCid());
		parameters.put("name",cto.getName());
		parameters.put("email",cto.getEmail());
		parameters.put("phone",cto.getPhone());
		parameters.put("city",cto.getCity());
		
		namedParameterJdbcTemp.update(sql, parameters);
	}
	
	
	

	public CustomerTO getCustomerByCid(int cid) {

	String sql="select * from customers where cid=:cid";
	
	SqlParameterSource parameters=new MapSqlParameterSource("cid",cid);
	
	CustomerTO cto=(CustomerTO)namedParameterJdbcTemp.queryForObject(sql, parameters,new CustomerRowMapper());
	
	return cto;
	
	}	
	

	
}
