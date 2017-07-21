package com.jlcindia.spring;


import java.util.*;
import org.hibernate.LockMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;


public class HibernateCustomerDAO implements CustomerDAO {
@Autowired
	HibernateTemplate hibernateTemp;
	
@Autowired
HibernateTransactionManager txManager=null;


public void addCustomers(CustomerTO cto) {
Customer cust=new Customer(cto.getName(),cto.getEmail(),cto.getPhone(),cto.getCity());

TransactionDefinition txDef=new DefaultTransactionDefinition();

TransactionStatus ts=txManager.getTransaction(txDef);

hibernateTemp.save(cust);
txManager.commit(ts);
	}




public void updateCustomer(CustomerTO cto) {
	
	TransactionDefinition txDef=new DefaultTransactionDefinition();
	TransactionStatus ts=txManager.getTransaction(txDef);
	
	Customer c=(Customer)hibernateTemp.load(Customer.class,cto.getCid());
	c.setCid(cto.getCid());
	c.setName(cto.getName());
	c.setEmail(cto.getEmail());
	c.setPhone(cto.getPhone());
	c.setCity(cto.getCity());
	
	hibernateTemp.update(c,LockMode.NONE);
	txManager.commit(ts);
	
	
}
	
	

	

	
}