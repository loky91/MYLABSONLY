package com.jlcindia.hibernate;


import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="jlcstudents")
public class Course {

	
	@Id
	@Column(name="cid")
	@GeneratedValue(strategy=GenerationType.AUTO)
private int cid;
	@Column(name="cname")
private String cname;
	@Column(name="duration")
private int duration;
	@Column(name="cost")
private double cost;
	
@ManyToMany(mappedBy="courses")	
private Set<Student> students;
public Course() {}

public Course(String cname, int duration, double cost) {

	this.cname = cname;
	this.duration = duration;
	this.cost = cost;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

public double getCost() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}

public Set<Student> getStudents() {
	return students;
}

public void setStudents(Set<Student> students) {
	this.students = students;
}

	
}
