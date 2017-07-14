package com.jlcindia.hibernate;

import java.util.*;
import org.hibernate.*;



public class Lab32N {

	public static void main(String args[]) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			//A> DISPLAY the CUSTOMERS by city with pagination
			
			String hql="from Customer cust where cust.city=?";
			
			Query query=session.createQuery(hql);
		query.setString(0,"blore");
		query.setFirstResult(0);
		query.setMaxResults(2);
			
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
