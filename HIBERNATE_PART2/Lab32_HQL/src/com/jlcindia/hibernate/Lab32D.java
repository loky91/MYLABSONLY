package com.jlcindia.hibernate;

import java.util.*;
import org.hibernate.*;



public class Lab32D {

	public static void main(String args[]) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			//A> DISPLAY the CUSTOMERS by STATUS
			
			String hql="from Customer cust where cust.status=?";
			Query query=session.createQuery(hql);
			query.setString(0,"ACTIVE");
			
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
