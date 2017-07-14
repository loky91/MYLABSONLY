package com.jlcindia.hibernate;
import org.hibernate.*;
public class Lab26 {

	public static void main(String args[]) {
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			Customer cust=new Customer("sri","sri@jlc",123,"blore",2500.0);
			session.save(cust);
			System.out.println("inserted");
			tx.commit();
			
			tx=session.beginTransaction();
			System.out.println("trying to update name");
			
			cust.setCname("nivas");
			session.update(cust);
			tx.commit();
			
			session.close();
			System.out.println("Record inserted");
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
	}
	
	
	
}
