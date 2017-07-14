package com.jlcindia.dao;

import com.jlcindia.util.*;

public interface CustomerDAO {

	public int addCustomer(CustomerTo cust);
	
	public void updateCustomer(CustomerTo cust);

	public void deleteCustomer(int cid);
	
	public CustomerTo getCustomerByCid(int cid);
	
}
