package com.jlcindia.hibernate;

public class Request {

	
	private int reqid;
	private String reqdate;
	private String description;
	private String status;
	private Customer customer;
	
	public Request() {}

	public Request(String reqdate, String description, String status) {
	
		this.reqdate = reqdate;
		this.description = description;
		this.status = status;
	}

	public int getReqid() {
		return reqid;
	}

	public void setReqid(int reqid) {
		this.reqid = reqid;
	}

	public String getReqdate() {
		return reqdate;
	}

	public void setReqdate(String reqdate) {
		this.reqdate = reqdate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Request [reqid=" + reqid + ", reqdate=" + reqdate + ", description=" + description + ", status="
				+ status ;
	}
	
	
	
}
