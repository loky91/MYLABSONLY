package com.jlcindia.hibernate;

import org.hibernate.*;

public class Lab10E {

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			WeekendStudent wes=new WeekendStudent("srinivas","blore","active",2000,5000,"4-5","mathiker","JLC","srinivas@jlc",23.4);
			wes.setSid(1);
			session.save(wes);
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
			
		}

	}

}
