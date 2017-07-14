package com.jlcindia.hibernate;

import org.hibernate.*;

public class Lab10A{
	
	public static void main(String args[]) {
		
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Student st=new Student("sri","blore","active",1800);
			st.setSid(1);
			session.save(st);
			tx.commit();
			session.close();
			
			
		}catch(Exception e) {
			
			
		}
		
		
	}
	
	
	
	
	
}