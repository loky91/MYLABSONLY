package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab37 {

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
		Contact c1=new Contact("sri","nivas","sri@jlc",989898,"1-2-1987","INACTIVE");
		
		Contact c2=new Contact("loken","Ranjan","manish@jlc.com",1011,"25-12-1987","ACTIVE");
		
		session.save(c1);
		session.save(c2);
		
		tx.commit();
		session.close();
			
		
			
			
			}catch(Exception e) {
				if(tx!=null) {
					tx.rollback();
					
				}
				e.printStackTrace();
			}

		
	}//main

}
