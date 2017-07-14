package com.jlcindia.spring;


import org.springframework.context.*;

public class BatchEvent extends ApplicationEvent{

	Batch batch;

	public BatchEvent(Object source,Batch batch) {
	super(source);
	this.batch=batch;
	System.out.println("inside batch event");
	}

	
	public Batch getBatch() {
		return batch;
		
		
	}

}
