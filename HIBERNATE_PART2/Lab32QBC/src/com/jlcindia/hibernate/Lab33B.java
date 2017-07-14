package com.jlcindia.hibernate;

import java.util.*;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;



public class Lab33B {

	public static void main(String args[]) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			//A> DISPLAY ALL CUSTOMERS BY CITY
			
		Criteria ct=session.createCriteria(Customer.class);
			ct.add(Restrictions.eq("city","blore"));
			
			List<Customer> list=ct.list();
			for(Customer cust:list)
				System.out.println(cust);
			
			tx.commit();
			session.close();
			
			
			
			
			
			
		}catch(Exception e) {
			if(tx!=null) {
				
				tx.rollback();
			}
			e.printStackTrace();
		}
		
	}
	
	
}
