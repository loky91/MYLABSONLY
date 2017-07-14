package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.*;
import java.util.*;


public class Lab36D {

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
String sql="select * from customers2 where city=? and status=?";

SQLQuery query=session.createSQLQuery(sql);
query.addEntity(Customer.class);

query.setString(0,"blore");
query.setString(1,"ACTIVE");

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
