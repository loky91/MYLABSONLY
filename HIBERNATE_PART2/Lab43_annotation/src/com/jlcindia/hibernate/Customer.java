package com.jlcindia.hibernate;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="customers7")
public class Customer {
@Id
@Column(name="cid")
@GenericGenerator(name="sidGenerator",strategy="com.jlcindia.hibernate.CIDGenerator")
@GeneratedValue(generator="sidGenerator")
	private String cid;

@Column(name="cname")
	private String cname;

@Column(name="email")
	private String email;

@Column(name="phone")
	private long phone;
	
	
	public Customer() {}
	
	public Customer(String cname, String email, long phone) {
	
		this.cname = cname;
		this.email = email;
		this.phone = phone;
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
