package com.jlcindia.hibernate;
import org.hibernate.*;
public class Lab16A {
public static void main(String args[]) {
	
	Transaction tx=null;
	try {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		
		tx=session.beginTransaction();
		
		Customer cust=new Customer("manish","kumar","manish@jlc.com",999);
		session.save(cust);
		
		Request req1=new Request("22/07/2014","hello1","ok1");
		Request req2=new Request("23/07/2014","hello2","ok2");
		
		session.save(req1);
		session.save(req2);
		
		req1.setCustomer(cust);
		req2.setCustomer(cust);
		
		tx.commit();
		
		session.close();
		System.out.println("record inserted");
		
	}catch(Exception e) {
		
		
	}
	
	
}
}
