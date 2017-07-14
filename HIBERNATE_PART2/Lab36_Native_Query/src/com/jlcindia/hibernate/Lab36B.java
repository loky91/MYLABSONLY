package com.jlcindia.hibernate;

import org.hibernate.*;
import java.util.*;
public class Lab36B {

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			//Display all customers
			
			String sql="select * from customers2 where city=?";
			
			SQLQuery query=session.createSQLQuery(sql);
			
			query.addEntity(Customer.class);
			query.setString(0,"blore");
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
