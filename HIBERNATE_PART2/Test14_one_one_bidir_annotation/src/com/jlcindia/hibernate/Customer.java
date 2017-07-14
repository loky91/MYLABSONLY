package com.jlcindia.hibernate;

import javax.persistence.*;

@Entity
@Table(name="mycustomers")

public class Customer {
@Id
@Column(name="cid")
@GeneratedValue(strategy=GenerationType.AUTO)
private	int cid;
@Column(name="firstName")
private	String firstName;
@Column(name="lastName")
private	String lastName;
@Column(name="email")
private	String email;
@Column(name="phone")
private	String phone;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="aid")

private	Address address;
	
	public Customer() {}

	public Customer(String firstName,String lastName,String email, String phone) {
		
		this.firstName = firstName;
		this.lastName=lastName;
		this.email = email;
		this.phone = phone;
		
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
	
}
