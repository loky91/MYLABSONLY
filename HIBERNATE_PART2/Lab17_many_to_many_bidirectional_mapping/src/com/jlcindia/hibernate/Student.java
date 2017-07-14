package com.jlcindia.hibernate;
import java.util.*;

public class Student {

private int sid;
private String sname;
private String email;
private long phone;

private Set<Course> courses;

public Student() {}

public Student(String sname, String email, long phone) {
	super();
	this.sname = sname;
	this.email = email;
	this.phone = phone;
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
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

public long getPhone() {
	return phone;
}

public void setPhone(long phone) {
	this.phone = phone;
}

public Set<Course> getCourses() {
	return courses;
}

public void setCourses(Set<Course> courses) {
	this.courses = courses;
}

@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", phone=" + phone + ", courses=" + courses
			+ "]";
}




}
