package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab13B {

	public static void main(String args[]) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			Customer cust=(Customer)session.load(Customer.class,1);
			
			System.out.println(cust.getCid()+""+cust.getFirstName()+""+cust.getLastName()+""+cust.getEmail()+""+cust.getPhone());
			
			
			
			Address add=cust.getAddress();
			System.out.println(add.getAid()+""+add.getCity()+""+add.getState()+""+add.getStreet());
			
			Address add1=(Address)session.load(Address.class,1);
			System.out.println(add1.getAid()+""+add1.getCity()+""+add1.getState()+""+add1.getStreet());
			
			
			
			
			
			
			
			
			}catch(Exception e) {
				e.printStackTrace();
				if(tx!=null)
					tx.rollback();
				
			}
			
			
	}
	
}
