package com.jlcindia.servlet;

import java.io.PrintWriter;

import javax.servlet.*;

import javax.servlet.http.*;
import java.io.*;


public class HelloServlet extends HttpServlet {

	
	ServletConfig cfg=null;

	public void init() throws ServletException {
	this.cfg=cfg;
		System.out.println("init method of Hello Servlet");
	}
	
	
	
	
	
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	
		System.out.println("service method of Hello servlet");
		
		String n=req.getParameter("name");
		String p=req.getParameter("phone");
		
		Writer out=res.getWriter();
		res.setContentType("text/html");
		
		
		out.write("<h1>Response from Hello Servlet");
		out.write("<h1>Request Parameters");
		out.write("<br/>Fname"+n);
		out.write("<br/>phone"+p);
		
		out.write("<hr/>Servlet Config Parameters");
		
		String eml=cfg.getInitParameter("email");
		 out.write("<br/>"+cfg);
		 out.write("<br/>"+eml);
		 
		 out.write("<hr/>Servlet Context Parameters");
		 
		 ServletContext ctx=cfg.getServletContext();
		 String web=ctx.getInitParameter("website");
		 out.write("<br/>"+ctx);
		 out.write("<br/>"+web);
		 
		 
		 
		
	}
}
