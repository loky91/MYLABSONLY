package com.jlcindia.hibernate;

import java.util.*;


public class Book {

	
	private int bid;
	private String bname;
	private double cost;
	private int edition;
	private String pub;
	
	
	private Set<Author> authors;
public Book() {}

	public Book(String bname, double cost, int edition, String pub) {
		
		this.bname = bname;
		this.cost = cost;
		this.edition = edition;
		this.pub = pub;
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public int getEdition() {
		return edition;
	}


	public void setEdition(int edition) {
		this.edition = edition;
	}


	public String getPub() {
		return pub;
	}


	public void setPub(String pub) {
		this.pub = pub;
	}


	public Set<Author> getAuthors() {
		return authors;
	}


	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
	
	
}
