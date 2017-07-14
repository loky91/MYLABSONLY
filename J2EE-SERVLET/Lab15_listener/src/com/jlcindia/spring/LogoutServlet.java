package com.jlcindia.spring;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LogoutServlet extends HttpServlet{

	
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		HttpSession sess=req.getSession(false);
		if(sess!=null)
			sess.invalidate();
		
		RequestDispatcher rd=req.getRequestDispatcher("logout.jsp");
		rd.forward(req, res);
		
	} 
	
}
