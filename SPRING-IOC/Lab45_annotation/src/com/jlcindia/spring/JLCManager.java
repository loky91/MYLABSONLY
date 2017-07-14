package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;

public class JLCManager {

	@Autowired
	private ApplicationEventPublisher publisher;
	
	public void addBatch(Batch bat) {
		System.out.println("jlcmanager-addbatch");
		publisher.publishEvent(new BatchEvent(this, bat));
		
	}
		
		public void addWorkshop(Workshop ws) {
			System.out.println("jlcmanager-addworkshop");
			publisher.publishEvent(new WorkshopEvent(this, ws));
			
		}
		
	public void createHello() {
		publisher.publishEvent(new HelloEvent());
		
	}
	
}
