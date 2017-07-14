package com.jlcindia.hibernate;

import org.hibernate.*;


public class Lab12A {

public static void main(String args[]) {
		
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			Customer cust=new Customer("sri","nivas","sri@jlc","1234");
			session.save(cust);
			
			Address add=new Address("HMT main","Blore","karnataka");
			session.save(add);
			
			cust.setAddress(add);
			
			tx.commit();
			session.close();
			System.out.println("Record Inserted");
			
		}catch(Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
			
		}
		
		
	}
	
}
