package com.jlcindia.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
	String	fn=req.getParameter("fname");
	String em=req.getParameter("email");
	String ph=req.getParameter("phone");
	
	
	String ge=req.getParameter("gender");
	String co=req.getParameter("course");
	String ti=req.getParameter("timings");
	String cous[]=req.getParameterValues("course");
	String re=req.getParameter("remarks");
	
	
	//2.process the data
	
	String msg="your enquiry has been added succesfully";
	
	System.out.println("full name"+fn);
	System.out.println("email"+fn);
	System.out.println("phone no"+ph);
	System.out.println("gender"+ge);
	System.out.println("timings"+ti);
	System.out.println("course"+co);
	
	
	System.out.println("All courses");
	System.out.println();
	if(cous!=null)
		for(String c:cous) {
			System.out.println(c);
			
		}
	System.out.println("remarks"+re);
	
	//3 response
	
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<h1>JAVA LEARNING CENTER</h1>");
	out.println("<h1>"+msg+"</h1>");
	out.println("<h1>FULL NAME"+fn);
	out.println("<h1>Email id"+em);
	out.println("<h1>Phone no"+ph);
	out.println("<h1>Gender"+ge);
	out.println("<h1>Timings"+ti);
	out.println("<h1>Course"+co);
	out.println("<h1>All course");
	
	if(cous!=null)
		for(String c:cous) {
		out.println("<br/>"+c);	
			
			}
	out.println("<h1>Remarks"+re);
	
	
	
	}
	
	
	
	

}
