package com.jlcindia.hibernate;

import org.hibernate.*;


public class Lab10B {

	public static void main(String args[]) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			CurrentStudent cs=new CurrentStudent("vas","blore","Active",17000,500,"7-9","Mathikere");
			cs.setSid(1);
			session.save(cs);
			tx.commit();
			session.close();
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	
}
