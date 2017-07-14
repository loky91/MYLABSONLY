package com.jlcindia.hibernate;
import java.util.*;
import org.hibernate.*;

public class Lab17A {

	public static void main(String args[]) {
		Transaction tx=null;
try {
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	
	tx=session.beginTransaction();
	Student s1=new Student("sri","sri@jlc.com",9999);
	Student s2=new Student("nivas","nivas@jlc",8888);
	
	Student s3=new Student("manish","manish@jlc",7777);
	
	session.save(s1);
	session.save(s2);
	session.save(s3);
	
	Course c1=new Course("java",new Integer(9),new Double(999));
	Course c2=new Course("JSP",new Integer(8),new Double(777));
	Course c3=new Course("EJB",new Integer(7),new Double(666));

	session.save(c1);
	session.save(c2);
	session.save(c3);
	
	Set<Course> cs1=new HashSet<Course>();
	cs1.add(c1);
	cs1.add(c2);

	s1.setCourses(cs1);
	Set<Course> cs2=new HashSet<Course>();
	cs2.add(c1);
	cs2.add(c2);
	cs2.add(c3);
	s2.setCourses(cs2);
	
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
