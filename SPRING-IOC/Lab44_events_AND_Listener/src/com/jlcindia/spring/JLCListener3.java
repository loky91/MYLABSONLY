package com.jlcindia.spring;

import org.springframework.context.*;

public class JLCListener3 implements ApplicationListener<WorkshopEvent> {
	
		public void onApplicationEvent(WorkshopEvent event) {
	WorkshopEvent we=(WorkshopEvent)event;
	System.out.println(we.getWorkshop());
	
		
	}

}
