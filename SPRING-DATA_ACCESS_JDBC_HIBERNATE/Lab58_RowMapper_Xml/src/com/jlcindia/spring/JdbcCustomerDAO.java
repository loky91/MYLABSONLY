package com.jlcindia.spring;

import com.jlcindia.spring.CustomerDAO;
import java.util.*;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.*;



public class JdbcCustomerDAO implements CustomerDAO{
	@Resource(name="dataSource")
	private DataSource dataSource;
	
@Autowired
JdbcTemplate jdbcTemp;



public List<CustomerTO> getAllCustomers(){
	String sql="select * from customers";
	List list=jdbcTemp.query(sql,new CustomerRowMapper());
	return list;
}
	

public int getCustomersCount() {
	
String sql="select count(*) from customers";
return jdbcTemp.queryForObject(sql,Integer.class);
}


public List<CustomerTO> getCustomersByCity(String city){
	
String sql="select * from customers where city=?";
List list=jdbcTemp.query(sql,new CustomerRowMapper(),city);
return list;
}



public CustomerTO getCustomerByEmail(String email) {
	String sql="select * from customers where email=?";
	CustomerTO cto=(CustomerTO)jdbcTemp.queryForObject(sql, new CustomerRowMapper(),email);
	return cto;
	
}


public String getCustomerCityByEmail(String email) {
	
String sql="select * from customers where email=?";
String city=(String)jdbcTemp.queryForObject(sql,String.class);
return city;
	
}

public CustomerTO getCustomerByCid(int cid) {
	
	String sql="select * from customers where cid=?";
	CustomerTO cto=(CustomerTO)jdbcTemp.queryForObject(sql, new CustomerRowMapper(),cid);
	
	return cto;	
}



public Long getCustomerPhoneByEmail(String email) {
	
	String sql="select phone from customers where email=?";
	Long ph=(Long)jdbcTemp.queryForObject(sql, Long.class,email);
		return ph;
		
}

}
