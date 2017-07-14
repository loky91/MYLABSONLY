package com.jlcindia.hibernate;

import org.hibernate.*;
import java.util.*;
public class Test36A {

	public static void main(String args[]) {
		
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			//Display all customers
			
			String sql="select * from customers2";
			
			SQLQuery query=session.createSQLQuery(sql);
			
			query.addEntity(Customer.class);
			
			List<Customer> list=query.list();
			
			for(Customer cust:list)
				System.out.println(cust);
			
			tx.commit();
			session.close();
			
			
			
		}catch(Exception e) {
			if(tx!=null) {
				tx.rollback();
				
			}
			e.printStackTrace();
		}
		
	}

}
