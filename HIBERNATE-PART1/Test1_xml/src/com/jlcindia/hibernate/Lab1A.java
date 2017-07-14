package com.jlcindia.hibernate;

import org.hibernate.*;

public class Lab1A {

	public static void main(String[] args) {
		
Transaction tx=null;
try {
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	tx=session.beginTransaction();
Customer cust=new Customer("lokendra","lok@jlc",1234,"bglr",230.0);

session.save(cust);

tx.commit();

	session.close();
	
}catch(Exception e) {
	
	e.printStackTrace();
	if(tx!=null)
		tx.rollback();
}

	}

}
