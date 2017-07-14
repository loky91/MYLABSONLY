package com.jlcindia.servlet;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet  extends HttpServlet{

	
	public void init(ServletConfig sc) throws ServletException {
	System.out.println("DemoServlet-init");
	
	String ci=sc.getInitParameter("city");
	System.out.println(ci);
		}
	
	
	
	
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		System.out.println("DemoServlet-service()");
		
		String nm=req.getParameter("name");
		String em=req.getParameter("email");
		
		String ip=req.getRemoteAddr();
		
		String msg="<h1>Hello!"+nm+"<br>";
	 msg="your mail id is"+em+"<br>";
	 msg=msg+"you are sending the request from iP address"+ip;
req.setAttribute("MSG",msg);
PrintWriter out=res.getWriter();
out.println(msg);


		
	}

	
	public void destroy() {
		System.out.println("DemoServlet-destroy");
		}
	
}
