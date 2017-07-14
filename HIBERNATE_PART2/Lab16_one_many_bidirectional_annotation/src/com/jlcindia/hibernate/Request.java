package com.jlcindia.hibernate;

import javax.persistence.*;
@Entity
@Table(name="requests")

public class Request {

	
	@Id
	@Column(name="reqid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reqid;
	
	
	@Column(name="reqdate")
	private String reqdate;
	@Column(name="description")
	private String description;
	@Column(name="status")
	private String status;
	@ManyToOne
	@JoinColumn(name="cid",referencedColumnName="cid")
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
