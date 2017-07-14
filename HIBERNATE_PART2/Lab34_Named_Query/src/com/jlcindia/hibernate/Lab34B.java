package com.jlcindia.hibernate;

import java.util.*;
import org.hibernate.*;

public class Lab34B {
public static void main(String args[]) {
	
	Transaction tx=null;
	try {
		

		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		
		//B DISPLAY THE CUSTOMERS BY CITY
		
		Query query=session.getNamedQuery("CustomersByCity");
		query.setString(0,"blore");

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