package com.jlcindia.hibernate;
import org.hibernate.*;

public class Lab41 {
public static void main(String args[]) {
	try {
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	
	



Customer cu=(Customer)session.load(Customer.class,"402881835cbf73df015cbf73e1600000");
System.out.println(cu.getCid()+"/t"+cu.getCname()+"/t"+cu.getEmail()+"/t"+cu.getPhone()+"/t"+cu.getPhone());


tx.commit();
session.close();


}catch(Exception e) {
e.printStackTrace();	
	
}
	
	
}
}