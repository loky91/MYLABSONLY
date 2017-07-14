package com.jlcindia.dao;

import java.io.*;

import org.hibernate.*;
import com.jlcindia.util.CustomerTo;
import com.jlcindia.hibernate.Customer;
import com.jlcindia.util.HibernateTemplate;


import com.jlcindia.util.CustomerTo;

public class HibernateCustomerDAO implements CustomerDAO {



	public int addCustomer(CustomerTo cto) {
		Customer cust=new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getStatus(),cto.getCity());
		
		Integer it=(Integer)HibernateTemplate.saveObject(cust);
		return it.intValue();
		
	}
	
	
	
	public void updateCustomer(CustomerTo cto) {
		Customer cust=new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getStatus(),cto.getCity());
		HibernateTemplate.updateObject(cust);
		
	}
	
	
	
	
	public void deleteCustomer(int cid) {
		HibernateTemplate.deleteObject(Customer.class,cid);
	}
	
	
	

	
	public CustomerTo getCustomerByCid(int cid) {
		
		 Customer cust=(Customer)HibernateTemplate.loadObject(Customer.class, cid);
		
		 CustomerTo cto=new CustomerTo(cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getCity(),cust.getStatus());
		 
		 return cto;
	}
	
	
	
	
	
}
