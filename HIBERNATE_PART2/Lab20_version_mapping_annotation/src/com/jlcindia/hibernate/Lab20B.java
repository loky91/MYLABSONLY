package com.jlcindia.hibernate;

import org.hibernate.*;
public class Lab20B {

	public static void main(String args[]) {
		
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			
			tx=session.beginTransaction();
			
			
			Customer cust=(Customer)session.load(Customer.class,1);
			cust.setCname("Manish");
			session.update(cust);
			tx.commit();
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
			
		}
		
	}
	
}
