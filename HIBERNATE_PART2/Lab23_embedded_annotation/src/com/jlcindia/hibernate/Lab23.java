package com.jlcindia.hibernate;
import org.hibernate.*;

public class Lab23 {
	public static void main(String args[]) {
Transaction tx=null;

try {
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	tx=session.beginTransaction();
	
	
	Address add=new Address();
	add.setCity("blore");
	add.setStreet("BTM LAYOUT");
	
	Customer cust=new Customer("sri",add);
	
	session.save(cust);
	tx.commit();
	session.close();
	System.out.println("record inserted");
	
	
	
	
	
}catch(Exception e) {
	e.printStackTrace();
	if(tx!=null)
		tx.rollback();
	
}

}
}
