package com.jlcindia.hibernate;

import java.util.*;

public class Customer {

private int cid;
private String firstName;
private String lastName;
private String email;
private long phone;

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
