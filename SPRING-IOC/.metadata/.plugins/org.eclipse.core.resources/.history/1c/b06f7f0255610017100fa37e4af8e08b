package com.jlcindia.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class JLCManager implements ApplicationContextAware{
ApplicationContext ctx=null;

public void addBatch(Batch bat) {
	System.out.println("jlcmanager-addbatch");
	ctx.publishEvent(new BatchEvent(this, bat));
	
}
	
	public void addWorkshop(Workshop ws) {
		System.out.println("jlcmanager-addworkshop");
		ctx.publishEvent(new WorkshopEvent(this, ws));
		
	}
	
	public void setApplicationContext(ApplicationContext ctx)  {
		System.out.println("jlcmanager-setApplicationContext");
		this.ctx=ctx;
	}
}
