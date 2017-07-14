package com.jlcindia.hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="WDSTU")
public class WeekdayStudent extends CurrentStudent{
	
private String qualification;
private String percentage;
private int yop;


public WeekdayStudent() {}

public WeekdayStudent(String sname,String city,String status,double totalfee,double feebals,String timings,String branch,String qualification,String percentage,int yop){
	
	
super(sname,city,status,totalfee,feebals,timings,branch);
	
	this.qualification=qualification;
	this.percentage=percentage;
	this.yop=yop;
	
	
	
}



public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

public String getPercentage() {
	return percentage;
}

public void setPercentage(String percentage) {
	this.percentage = percentage;
}

public int getYop() {
	return yop;
}

public void setYop(int yop) {
	this.yop = yop;
}



}
