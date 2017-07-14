package com.jlcindia.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet{

	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		
		//collection client data
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		String msg="";
		
		//2.verify client data
		
		if(username.equals(password)) {
			msg="<h1>LOGIN SUCCESS<br/>WELCOME TO JLC HOME PAGE";
			
		}else {
			msg="<h1> LOGIN FAILED<br/>invalid username or password";
			
		}
		
		
		//3.PREPARING THE RESPONSE
		
		PrintWriter out=res.getWriter();
		out.write(msg);
	}
	
	
	
}
