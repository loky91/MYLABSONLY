package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab16C {

	public static void main(String args[]) {
		
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			
			tx=session.beginTransaction();
			
			Request req=(Request)session.load(Request.class,2);
			System.out.println("Request info");
			System.out.println(req);
			
			Customer cust=req.getCustomer();
			
			System.out.println("customer info");
			
			System.out.println(cust);
			
			
			
			
			tx.commit();
			
			session.close();
	
			
		}catch(Exception e) {
			
			
		}
		
		
	}
	
}
