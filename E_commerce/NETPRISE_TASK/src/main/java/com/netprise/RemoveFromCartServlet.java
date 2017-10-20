package com.netprise;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RemoveFromCartServlet extends HttpServlet{

	protected void service(HttpServletRequest request,HttpServletResponse response)  throws ServletException,IOException{
		
		
		HttpSession session=request.getSession(false);
		if(session==null) {
			
			request.setAttribute("MSG","session is destroyed");
		}else {
			
			String pnm=request.getParameter("p_name");
			// Removing the client selected product from session
			
			session.removeAttribute(pnm);
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("showcart.net");
		rd.forward(request, response);
	}
	
	
}
