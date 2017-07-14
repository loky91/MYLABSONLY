package com.jlcindia.hibernate;

import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="jlccustomers")

public class Customer {
@Id
@Column(name="cid")
@GeneratedValue(strategy=GenerationType.AUTO)

private int cid;

@Column(name="firstName")
private String firstName;
@Column(name="lastName")
private String lastName;
@Column(name="email")
private String email;
@Column(name="phone")
private long phone;

@OneToMany(mappedBy="customer")
private Set<Request>requests;

public Customer() {
	

}

public Customer(String firstName, String lastName, String email, long phone) {

	this.firstName = firstName;
	this.lastName = lastName;
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

public long getPhone() {
	return phone;
}

public void setPhone(long phone) {
	this.phone = phone;
}

public Set<Request> getRequests() {
	return requests;
}

public void setRequests(Set<Request> requests) {
	this.requests = requests;
}

@Override
public String toString() {
	return "Customer [cid=" + cid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", phone=" + phone ;
}




	
	
}
