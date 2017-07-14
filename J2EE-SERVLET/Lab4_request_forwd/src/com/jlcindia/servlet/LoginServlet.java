package com.jlcindia.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LoginServlet extends HttpServlet{

	
	protected void service(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException{
		System.out.println("service of TestServlet");
		
		String unm=req.getParameter("uname");
		String pw=req.getParameter("password");
		
		
		Writer out=res.getWriter();
		
		out.write("welcome to jlc");
		
		String page="";
		
		
		if(unm.equals(pw)) {
			page="/WEB-INF/home.html";
			RequestDispatcher rd=req.getRequestDispatcher(page);
			rd.forward(req, res);
			
		}
		else {
			
			page="/WEB-INF/error.html";
			RequestDispatcher rd=req.getRequestDispatcher(page);
			rd.forward(req, res);
			
			
		}
		
		
		out.write("<h1> again ,welcome to JLC");
		
		System.out.println("service completed-last statement");
		
	}
	
}
