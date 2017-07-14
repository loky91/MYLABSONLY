package com.jlcindia.hibernate;
import org.hibernate.*;
public class Lab21A {
public static void main(String args[]) {
	Transaction tx=null;
	try {
		
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	tx=session.beginTransaction();
	
	Customer cust=new Customer("sri","sri@jlc",7474);
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
