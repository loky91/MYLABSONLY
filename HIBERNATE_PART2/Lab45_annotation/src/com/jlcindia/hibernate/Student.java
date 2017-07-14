package com.jlcindia.hibernate;

import javax.persistence.*;


@Entity
@Table(name="students1")
public class Student {
@Id
@Embedded
@AttributeOverrides({
	@AttributeOverride(name="bid",column=
@Column(name="bid")), 
	@AttributeOverride(name="sid",column=
	@Column(name="sid"))	})
	private SID studentid;
@Column(name="sname")
	private String sname;
@Column(name="email")
	private String email;
@Column(name="phone")
	private String phone;
	
	
	
	
	public Student(SID studentid, String sname, String email, String phone) {
		
		this.studentid = studentid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}
	public SID getStudentid() {
		return studentid;
	}
	public void setStudentid(SID studentid) {
		this.studentid = studentid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
	
	
	
	
	
}
