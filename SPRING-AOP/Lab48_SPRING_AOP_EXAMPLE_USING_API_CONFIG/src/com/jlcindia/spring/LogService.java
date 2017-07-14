package com.jlcindia.spring;

public class LogService {

	public void logBefore() {
		
		System.out.println("LS-logBEFORE");
	}
	
	public void logReturning() {
		
		System.out.println("LS-logReturning");		
	}
	
	
	public void logThrowing(Exception e) {
		
		System.out.println("LS-logThrowing");
		System.out.println(e);
	}
	
}
