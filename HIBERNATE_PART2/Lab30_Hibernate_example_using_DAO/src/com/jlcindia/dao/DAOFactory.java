package com.jlcindia.dao;
import com.jlcindia.hibernate.*;
import com.jlcindia.util.*;


public class DAOFactory {

	
	static CustomerDAO customerDAO;
	static {
		
		customerDAO =new HibernateCustomerDAO();
		
	}
	
	public static CustomerDAO getCustomerDAO() {
	return customerDAO;	
		
	}
	
	
}
