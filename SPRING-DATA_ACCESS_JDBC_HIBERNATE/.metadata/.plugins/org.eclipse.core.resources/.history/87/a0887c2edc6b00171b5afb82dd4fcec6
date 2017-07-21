package com.jlcindia.spring;


import java.sql.SQLException;
import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;


public class HibernateCustomerDAO extends HibernateDaoSupport implements CustomerDAO {

	
	public void addCustomer(CustomerTO cto) {

	final Customer cust=new Customer(cto.getName(),cto.getEmail(),cto.getPhone(),cto.getCity());
	HibernateCallback<Session> hc=new HibernateCallback<Session>() {
		
		
		public Session doInHibernate(Session session) throws HibernateException, SQLException {
			session.save(cust);
			return session;
			
		}
	};
	
	getHibernateTemplate().execute(hc);
	}









	
}
