package com.jlcindia.hibernate;

import java.util.*;
import org.hibernate.*;

public class Lab18B {
public static void main(String args[]) {
	Transaction tx=null;
	
	try {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		
		
		Student s1=(Student)session.load(Student.class,1);
		System.out.println("Student info");
		System.out.println(s1);
		System.out.println("Course info");
		Set<Course> cous=s1.getCourses();
		for(Course c:cous) {
			
			System.out.println(c);
			
		}
		tx.commit();
		session.close();
	}catch(Exception e) {
		
		e.printStackTrace();
		if(tx!=null)
			tx.rollback();
	}
}
	
	
	
}
