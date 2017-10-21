package com.netprise;

import java.util.*;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowCartServlet extends HttpServlet{

	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		HttpSession session=request.getSession(false);
		if(session==null) {
			request.setAttribute("MSG","Session is destroyed");
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		
		rd.forward(request, response);
		
		
		
	}else {
		Enumeration<String> enms=session.getAttributeNames();
		
		
		List selectedlist=Collections.list(enms);
	
		System.out.println("---->"+selectedlist);
		selectedlist.remove("UN");
		
	if(selectedlist.size()==0 ) {
		
		request.setAttribute("MSG","NO PRODUCTS SELECTED");
	}else {
		
		request.setAttribute("CART",selectedlist);
		
	}
	
	RequestDispatcher rd=request.getRequestDispatcher("showcart.jsp");
	rd.forward(request, response);
		
	}
	
}
}