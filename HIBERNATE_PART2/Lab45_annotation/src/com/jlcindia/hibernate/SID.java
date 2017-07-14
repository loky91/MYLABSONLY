package com.jlcindia.hibernate;

import java.io.*;
import javax.persistence.*;
@Embeddable
public class SID implements Serializable{

	private String bid;
	private String sid;
	
	public SID() {}

	public SID(String bid, String sid) {

		this.bid = bid;
		this.sid = sid;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	
	
}
