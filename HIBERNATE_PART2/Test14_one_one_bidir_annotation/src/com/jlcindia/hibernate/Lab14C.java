package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab14C {

	public static void main(String args[]) {
	Transaction tx=null;
	try {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		
		
		Address add=(Address)session.load(Address.class,2);
		System.out.println(add.getAid()+""+add.getCity()+""+add.getStreet()+""+add.getState());
		
		Customer cust=add.getCustomer();
		System.out.println(cust.getCid()+""+cust.getFirstName()+""+cust.getLastName()+""+cust.getEmail()+""+cust.getPhone());
		
		tx.commit();
		session.close();
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
		if(tx!=null)
			tx.rollback();
		
	}
	}
	
}
