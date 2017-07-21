package com.jlcindia.spring;

import java.util.List;

public interface CustomerDAO {

	public void addCustomer(CustomerTO cto);
	public void updateCustomer(CustomerTO cto);

	public CustomerTO getCustomerByCid(int cid);
	
	
}
