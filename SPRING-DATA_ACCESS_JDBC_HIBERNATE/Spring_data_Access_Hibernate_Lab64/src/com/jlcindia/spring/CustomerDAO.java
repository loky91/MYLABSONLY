package com.jlcindia.spring;

import java.util.List;

public interface CustomerDAO {

	
	public List<CustomerTO> getAllCustomers();
	public String getCustomerByEmail(String email);
	
	
}
