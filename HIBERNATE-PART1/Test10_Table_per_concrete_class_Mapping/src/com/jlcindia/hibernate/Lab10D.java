package com.jlcindia.hibernate;


import org.hibernate.*;
public class Lab10D {

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			WeekdayStudent wds=new WeekdayStudent("SD","Blore","Active",1200,300,"1.0-2.0","BTM","M.Tech","98%",1999);
			wds.setSid(1);
			session.save(wds);
			tx.commit();
			session.close();
			
		}catch(Exception e) {
		e.printStackTrace();	
			
		}

	}

}
