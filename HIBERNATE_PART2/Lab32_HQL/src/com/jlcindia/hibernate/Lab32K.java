package com.jlcindia.hibernate;

import java.util.*;
import org.hibernate.*;



public class Lab32K {

	public static void main(String args[]) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			//A> DISPLAY the CUSTOMERS by balance range and city
			
			String hql="from Customer cust where cust.city in (:cities)";
			
			Query query=session.createQuery(hql);
		query.setParameterList("cities",new String[] {"blore","Hyd"});
			
			List<Customer> list=query.list();
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
