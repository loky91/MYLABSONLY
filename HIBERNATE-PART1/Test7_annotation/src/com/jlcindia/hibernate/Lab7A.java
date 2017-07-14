package com.jlcindia.hibernate;

import org.hibernate.*;
public class Lab7A {

	public static void main(String[] args) {
		
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			//1.ADD THE STUDENT
			Student stu=new Student("sri","blore","enabled",1500);
			Integer it=(Integer)session.save(stu);
			System.out.println(it.intValue());
			
			
			//2.Adding the CurrentStudent
			CurrentStudent cstu=new CurrentStudent("vas","blore","enabled",1234.0,200.0,"6.50PM","mathikere");
			it=(Integer)session.save(cstu);
			System.out.println(it.intValue());
			
			
			//3.Adding the old student
			
			OldStudent ostu=new OldStudent("aa","bhilai","enabled",345.0,"SDSOFT","aa@sd.com",9.0);
			it=(Integer)session.save(ostu);
			System.out.println(it.intValue());
			
			
			//4.Adding the WeekdayStudent
			
			WeekdayStudent wdstu=new WeekdayStudent("bb","blore","enabled",1300.0,2000.0,"4.30PM","mathikere","M.SC","85.5",3);
			it=(Integer)session.save(wdstu);
			System.out.println(it.intValue());
			
			
			//5.Adding the WeekendStudent
			WeekendStudent wstu=new WeekendStudent("cc","blore","enabled",1600.0,300.0,"5.20PM","HSR","SDSOFT","cc@sd.com",9.0);
			it=(Integer)session.save(wstu);
			System.out.println(it.intValue());
			tx.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
			
		}
		
	}

}
