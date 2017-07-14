package com.jlcindia.servlet;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet{

	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		
		HttpSession sess=req.getSession();
		Writer out=res.getWriter();
		out.write("<h1><br/>"+sess.getId());
		out.write("<br/>"+sess.isNew());
		
		out.write("<br/>"+sess.getCreationTime());
		String em=req.getParameter("email");
		System.out.println(em);
		String method=req.getMethod();
		System.out.println(method);
		
		
		sess.setMaxInactiveInterval(10);
ServletContext ctx=sess.getServletContext();
sess.invalidate();


	}
	
}
