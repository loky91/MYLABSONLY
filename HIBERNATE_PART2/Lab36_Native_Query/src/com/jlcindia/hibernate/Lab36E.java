package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab36E {

	public static void main(String[] args) {
		
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
		//E Display Customers with pagination
			String sql="select * from customers2";
			SQLQuery query=session.createSQLQuery(sql);
			query.addEntity(Customer.class);
			
			query.setFirstResult(0);
			query.setMaxResults(5);
			
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
