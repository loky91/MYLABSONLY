package com.jlcindia.hibernate;

import java.util.*;
import org.hibernate.*;

public class Lab15B {
public static void main(String args[]) {
	Transaction tx=null;
	try {
	
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		
		tx=session.beginTransaction();
		
		Customer cust=(Customer)session.load(Customer.class,1);
		System.out.println("Customer info");
		
		System.out.println(cust);
		System.out.println("Request info");
		
		Collection<Request> col=cust.getRequests();
		
		for(Request req:col) 
			System.out.println(req);
			
		tx.commit();
		session.close();
		
		
		
	}catch(Exception e)  {
		e.printStackTrace();
		if(tx!=null)
			tx.rollback();
	}
}
	
	
}
