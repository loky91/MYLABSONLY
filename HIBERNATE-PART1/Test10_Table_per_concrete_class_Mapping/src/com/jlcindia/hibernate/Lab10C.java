package com.jlcindia.hibernate;


import org.hibernate.*;
public class Lab10C {

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			OldStudent os=new OldStudent("nivas","Blore","active",1300,"JLC","nivas@jlc",5.6);
os.setSid(1);
session.save(os);
tx.commit();
session.close();
		}catch(Exception e) {
			
			
			
		}

	}

}
