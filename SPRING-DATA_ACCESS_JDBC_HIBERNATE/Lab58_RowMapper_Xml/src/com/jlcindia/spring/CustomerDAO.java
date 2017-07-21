package com.jlcindia.spring;

import java.util.*;

public interface CustomerDAO {

	
	public List<CustomerTO> getAllCustomers();
	public CustomerTO getCustomerByCid(int cid);
	public CustomerTO getCustomerByEmail(String email);
	public List<CustomerTO> getCustomersByCity(String email);
	public int getCustomersCount();
	public String getCustomerCityByEmail(String email);
	
	public Long getCustomerPhoneByEmail(String email);
}
