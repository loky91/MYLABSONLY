package com.jlcindia.hibernate;




import java.util.*;

import org.hibernate.*;
public class Lab28B {

	public static void main(String[] args) {
	
Transaction tx=null;

try {
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	tx=session.beginTransaction();
	
	CreditCard cc1=new CreditCard(11,"visa",999,new Date());
	session.save(cc1);
	
	SilverCustomer c1=new SilverCustomer("sd","sd@jlc",1234,"blore",10,"c@jlc");
	c1.setCcard(cc1);
	session.save(c1);
	
	Map<String,String> refs=new HashMap<String,String>();
	refs.put("AA","11");
	refs.put("BB","22");
	
	CreditCard cc2=new CreditCard(222,"Amex",999,new Date(0));
	session.save(cc2);
	
	GoldCustomer c2=new GoldCustomer("manish","manish@jlc",1234,4321,refs,100);
	c2.setCcard(cc2);
	session.save(c2);
	
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
