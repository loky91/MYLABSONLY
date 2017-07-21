package com.jlcindia.spring;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import com.jlcindia.spring.InsufficientFundsException;

public class HibernateAccountDAO extends HibernateDaoSupport implements AccountDAO {


	
	
	

	
	@Override
	public double getBalance(int accno) {
System.out.println("inside getbal");
		Account acc=getHibernateTemplate().load(Account.class,accno);
		
		return acc.getBal();
	}
	
	
	
	public void deposit(int accno,double amt) {
	
			System.out.println("inside deposit");
			Account acc=getHibernateTemplate().load(Account.class,accno);
			double cbal=acc.getBal();
			acc.setBal(cbal+amt);
			getHibernateTemplate().update(acc);
			
			
	
		
	}
	
public void withdraw(int accno,double amt) {
		
	
	System.out.println("inside withdraw");
	
	Account acc=getHibernateTemplate().load(Account.class,accno);
	double cbal=acc.getBal();
	if(cbal>=1000+amt) {
	acc.setBal(cbal-amt);
	getHibernateTemplate().update(acc);
		
	}else {
		throw new InsufficientFundsException();
	}	

	
}//withdraw








public void fundsTransfer(int saccno,int daccno,double amt) {

	 System.out.println("inside funds transfer");
	 System.out.println("going to deposit");
	 deposit(daccno, amt);
	 System.out.println("going to withdraw"); 
	 withdraw(saccno, amt);

	
}







}
