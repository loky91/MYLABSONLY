package com.jlcindia.hibernate;

import org.hibernate.*;

public class Lab40 {

	public static void main(String[] args) {
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			
			Customer cust=new Customer("sd","sd@jlc.com",12345);
			Integer it=(Integer)session.save(cust);
			System.out.println(it.intValue());
			
			tx.commit();
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
