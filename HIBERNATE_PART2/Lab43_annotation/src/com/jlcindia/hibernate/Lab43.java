package com.jlcindia.hibernate;

import org.hibernate.*;

public class Lab43 {

	public static void main(String args[]) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Customer cust=new Customer("ly","lok@jlc.com",99071);
		String customerid=session.save(cust).toString();
		
		System.out.println(customerid);
		
		tx.commit();
		session.close();
		
		
	}
	
}
