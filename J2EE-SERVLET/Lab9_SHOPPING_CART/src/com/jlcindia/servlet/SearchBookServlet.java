package com.jlcindia.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SearchBookServlet extends HttpServlet {

	protected void service(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException{
		
		
		
		String ct=req.getParameter("category");
		if(ct!=null && ct.equals("java")) {
			
			
			ArrayList<String> blist=new ArrayList<String>();
			blist.add("spring");
			blist.add("hibernate");
			blist.add("maven");
			blist.add("jsp");
			HttpSession sess=req.getSession();
			sess.setAttribute("BOOKS",blist);
			
		}else {
			
			req.setAttribute("MSG","NO BOOKS FOUND FOR THE CATEGORY"+ct);
			
			}
		
		RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
		rd.forward(req, res);
		
	}
	
	
}
