package com.jlcindia.spring;

import java.awt.Event;
import javax.servlet.*;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyContextAttributeListener
 *
 */
@WebListener
public class MyContextAttributeListener implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public MyContextAttributeListener() {
    	System.out.println("mycontextAttribute listener def const");
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent event)  { 
        String nm=event.getName();
        String val=event.getValue().toString();
        System.out.println("attribute added"+nm+"\t"+val);
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent event)  { 
    	 String nm=event.getName();
         String val=event.getValue().toString();
         System.out.println("attributeRemoved"+nm+"\t"+val);
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent event)  { 
    	 String nm=event.getName();
         String val=event.getValue().toString();
         System.out.println("attribute replaced"+nm+"\t"+val);
    }
	
}
