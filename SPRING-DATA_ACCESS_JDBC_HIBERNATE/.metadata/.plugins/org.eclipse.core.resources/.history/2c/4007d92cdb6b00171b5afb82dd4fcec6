package com.jlcindia.spring;


import java.util.*;
import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
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



public CustomerTO getCustomerByEmail(String email) {
	DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
	List<Customer> list=(List<Customer>)hibernateTemp.findByCriteria(dc);
	Customer c=(Customer)list.get(0);
	CustomerTO cto=new CustomerTO(c.getCid(),c.getName(),c.getEmail(),c.getPhone(),c.getCity());
	return cto;
}



@Override
public Long getCustomerPhoneByEmail(String email) {
	DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
	dc.add(Restrictions.eq("email", email));
	List<Customer> list=(List<Customer>)hibernateTemp.findByCriteria(dc);
	Customer c=list.get(0);
	return c.getPhone();
}







@Override
public List<CustomerTO> getCustomerByCity(String city) {

	List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
	DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
	dc.add(Restrictions.eq("city", city));
	
	hibernateTemp.setCacheQueries(true);
	List<Customer> list=(List<Customer>)hibernateTemp.findByCriteria(dc);
	for(Customer c:list) {
		
		CustomerTO cto=new CustomerTO(c.getCid(),c.getName(),c.getEmail(),c.getPhone(),c.getCity());
		ctoList.add(cto);
		
		
	}

	return ctoList;
}




	
}
