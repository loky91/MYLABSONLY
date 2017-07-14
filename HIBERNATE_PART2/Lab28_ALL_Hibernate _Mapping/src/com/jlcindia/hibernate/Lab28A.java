package com.jlcindia.hibernate;

import java.util.*;
import org.hibernate.*;
public class Lab28A {

	public static void main(String[] args) {
	
		Transaction tx=null; 
		
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			
			List<String> qualis=new ArrayList<String>();
			qualis.add("msc");
			qualis.add("mca");
			qualis.add("mtech");
			
			
			Set<String> exps=new HashSet<String>();
			exps.add("sun");
			exps.add("IBM");
			exps.add("oracle");
			
			
Author a1=new Author("sri","sri@jlc",123,new Date(),qualis,exps);
session.save(a1);
	
			
			
Author a2=new Author("vas","vas@jlc",321,new Date(),qualis,exps);
session.save(a2);			

	
Book b1=new Book("master java",99.99,1,"JLC");
session.save(b1);


Book b2=new Book("master Hiber",99.99,1,"JLC");
session.save(b2);


Book b3=new Book("master spring",99.99,1,"JLC");
session.save(b3);



Set<Author> as1=new HashSet<Author>();
as1.add(a1);



Set<Author> as2=new HashSet<Author>();
as2.add(a1);
as2.add(a2);
			


b1.setAuthors(as1);

b1.setAuthors(as2);

tx.commit();
session.close();


		}catch(Exception e) {
			
			
		}
		
		
		

	}

}
