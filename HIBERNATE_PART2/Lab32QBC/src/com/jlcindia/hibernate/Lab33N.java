package com.jlcindia.hibernate;

import java.util.*;
import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;



public class Lab33N{

	public static void main(String args[]) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			//A> DISPLAY ALL CUSTOMERS BY CITY AND STATUS and card type
			
		Criteria ct=session.createCriteria(Customer.class);
	
		ct.add(Restrictions.eq("city","blore"));
		ct.setFirstResult(0);
		ct.setMaxResults(2);
		
		
		
	
			
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
