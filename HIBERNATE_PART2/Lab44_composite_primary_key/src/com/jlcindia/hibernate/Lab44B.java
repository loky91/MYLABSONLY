package com.jlcindia.hibernate;


import org.hibernate.*;

public class Lab44B {
public static void main(String args[]) {
	
	try {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		
		Object obj=session.get(Student.class,new SID("30","001"));
		if(obj==null)
		{
			
			System.out.println("STUDENT NOT FOUND");
		}else {
			
			Student stu1=(Student)obj;
			System.out.println(stu1.getStudentid().getBid());
			System.out.println(stu1.getStudentid().getSid());
			System.out.println(stu1.getSname());
			System.out.println(stu1.getEmail());
			System.out.println(stu1.getPhone());
	
			
		}
	tx.commit();
	session.close();
		
	}catch(Exception e) {
		
		e.printStackTrace();
		
	}
	
	
}
	
	
}
