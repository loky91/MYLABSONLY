package com.jlcindia.hibernate;

public class Customer {

	private String customerid;
	private String cid;
	private String cname;
	
	private String email;
	private long phone;
	
	public Customer() {}
	
	public Customer(String cid, String cname, String email, long phone) {
	
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
	
	
}
