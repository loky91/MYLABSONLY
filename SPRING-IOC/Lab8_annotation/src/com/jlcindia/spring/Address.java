package com.jlcindia.spring;

public class Address {
	
private String city;
private String street;
private String state;


public Address(String city,String street,String state) {
	
	this.city=city;
	this.street=street;
	this.state=state;
}



public String toString() {
	return "Address [city=" + city + ", street=" + street + ", state=" + state + "]";
}



}
