package com.jlcindia.spring;

public class AccountService {

	public void getBal() {
		
		System.out.println("get-BAL-Begin");
		System.out.println("get-BAL-done");
		System.out.println("get-BAL-end");
	}
	
	
	public void myDeposit() {
		System.out.print("deposit-begin");
		System.out.println("deposit-done");
		System.out.println("deposit-end");
	}
	
	
	public void myWithdraw()  throws Exception{
		
		System.out.println("withdraw-begin");
		if(1==1) {

	throw new InsufficientFundsException();		
	}
		
	System.out.println("withdraw-end");
	
}

}