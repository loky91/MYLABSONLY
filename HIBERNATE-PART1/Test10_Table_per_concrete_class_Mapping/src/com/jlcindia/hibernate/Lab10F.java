package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10F {

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Student st=(Student) session.load(WeekendStudent.class,1);
	System.out.println(st);
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
			
		}

	}

}
