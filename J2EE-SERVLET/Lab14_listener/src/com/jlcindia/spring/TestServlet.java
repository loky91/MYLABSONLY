package com.jlcindia.spring;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet  extends HttpServlet{

	
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		System.out.println("TEst Servlet-->service()");

		System.out.println("Accesing session object");
		
		HttpSession sess=req.getSession();
		String eml=req.getParameter("email");
		
		ServletContext ctx=getServletContext();
		
		System.out.println("storing attribute in context");
		ctx.setAttribute("email",eml);
		
		System.out.println("Replacing attribute in context");
		ctx.setAttribute("email",eml);
		
		
		System.out.println("Removing attribute from context");
		ctx.removeAttribute("email");
		System.out.println("Invalidating session object");
		sess.invalidate();
	}
}
