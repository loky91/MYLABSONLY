package com.jlcindia.hibernate;

import org.hibernate.*;
import java.util.*;


public class Lab3A {

	public static void main(String[] args) {
		
		Transaction tx=null;
		try {
			
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			String cous[]= {"java","JDBC","JSP"};
			
			List<String> ems=new ArrayList<String>();
			ems.add("aa@jlc");
			ems.add("bb@jlc");
			ems.add("cc@jlc");
			ems.add("dd@jlc");
			
			List<Integer> maks=new ArrayList<Integer>();
			maks.add(new Integer(100));
			maks.add(new Integer(99));
			maks.add(new Integer(100));
			
			
			
			Set<Long> phs=new HashSet<Long>();
			phs.add(new Long(111));
			phs.add(new Long(222));
			phs.add(new Long(333));
			phs.add(new Long(444));
			
			
			Map<String,Long> refs=new HashMap<String,Long>();
			refs.put("aaa",new Long(1111));
			refs.put("bbb",new Long(2222));
			refs.put("ccc",new Long(3333));
			refs.put("ddd",new Long(4444));
			
		Student stu=new Student("sri","10-10-10","msc",cous,ems,maks,phs,refs);
		session.save(stu);
		
		}catch(Exception e) {
			
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
		
	}

}
