package com.jlcindia.spring;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class JLCMTAdvice implements ThrowsAdvice{

	@Autowired
	LogService ls=null;
	
	@Autowired
	TxService ts=null;
	
	public void afterThrowing(Exception e) {
		ts.rollback();
		ls.logThrowing(e);
		
	}
	
	
}
