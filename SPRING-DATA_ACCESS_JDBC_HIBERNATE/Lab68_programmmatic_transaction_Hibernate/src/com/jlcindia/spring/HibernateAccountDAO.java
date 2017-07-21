package com.jlcindia.spring;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import com.jlcindia.spring.InsufficientFundsException;

public class HibernateAccountDAO implements AccountDAO {

	@Autowired
HibernateTemplate hibernateTemp;
	
	
	
	@Autowired
	PlatformTransactionManager txManager;
	
	@Override
	public double getBalance(int accno) {
System.out.println("inside getbal");
		Account acc=hibernateTemp.load(Account.class,accno);
		
		return acc.getBal();
	}
	
	
	
	public void deposit(int accno,double amt) {
		TransactionStatus ts=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
			ts=txManager.getTransaction(txDef);
			System.out.println("inside deposit");
			Account acc=hibernateTemp.load(Account.class,accno);
			double cbal=acc.getBal();
			acc.setBal(cbal+amt);
			hibernateTemp.update(acc);
			txManager.commit(ts);
			
		}catch(Exception e) {
			
			e.printStackTrace();
			txManager.rollback(ts);
		}
		
	}
	
public void withdraw(int accno,double amt) {
		
	TransactionStatus ts=null;
	try {
		TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
	ts=txManager.getTransaction(txDef);
	System.out.println("inside withdraw");
	
	Account acc=hibernateTemp.load(Account.class,accno);
	double cbal=acc.getBal();
	if(cbal>=1000+amt) {
	acc.setBal(cbal-amt);
	hibernateTemp.update(acc);
		
	}else {
		throw new InsufficientFundsException();
	}	
	
	txManager.commit(ts);
	}catch (Exception e) {
		e.printStackTrace();
		txManager.rollback(ts);
	}	
	
}//withdraw








public void fundsTransfer(int saccno,int daccno,double amt) {
	TransactionStatus ts=null;
	try {
		TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
	 ts=txManager.getTransaction(txDef);
	 System.out.println("inside funds transfer");
	 System.out.println("going to deposit");
	 deposit(daccno, amt);
	 System.out.println("going to withdraw"); 
	 withdraw(saccno, amt);
	 
	 txManager.commit(ts);
	 
	 }catch(Exception e) {
	
		e.printStackTrace();
		txManager.rollback(ts);
	}
}







}
