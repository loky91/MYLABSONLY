package com.jlcindia.spring;

public class Batch {

	
	String bid;
	String sd;
	String timings;
	int nos;
	
	
	public Batch(String bid, String sd, String timings, int nos) {
		
		this.bid = bid;
		this.sd = sd;
		this.timings = timings;
		this.nos = nos;
		System.out.println("inside batch");
	}
	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", sd=" + sd + ", timings=" + timings + ", nos=" + nos + "]";
	}
	
	
	
}
