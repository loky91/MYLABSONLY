package com.jlcindia.spring;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;



public class MySessionListener implements HttpSessionListener {

    
    public MySessionListener() {
    System.out.println("My Session Listener def constructor");
    
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent arg0)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("session created");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("session destroyed");
    }
	
}
