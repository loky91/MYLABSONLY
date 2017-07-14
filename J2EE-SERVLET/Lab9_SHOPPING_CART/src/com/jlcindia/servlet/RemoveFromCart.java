package com.jlcindia.servlet;

import java.io.IOException;


import javax.servlet.*;

import javax.servlet.http.*;

public class RemoveFromCart extends HttpServlet{

	
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		HttpSession sess=req.getSession(false);
		if(sess==null) {
			
			req.setAttribute("MSG","session is destroyed");
			RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
			rd.forward(req, res);
			
		}else {
			
			String bnm=req.getParameter("bname");
			sess.removeAttribute(bnm);
			
			
		}
		
		RequestDispatcher rd=req.getRequestDispatcher("showcart.jlc");
		rd.forward(req, res);
	}
	
}
