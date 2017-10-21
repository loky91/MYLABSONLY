package com.netprise;

import java.io.IOException;


import java.sql.*;


import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.netprise.*;
/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService=new UserService();
		
		
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		
		
		int x=userService.verifyUser(un, pw);
		
		HttpSession session=request.getSession();
		String result="";
		
		if(x==1) {
			session.setAttribute("UN",un);
			result="home.jsp";
			
			
			
			
			
			
		}else {
			
			String msg="INVALID USERNAME OR PASSWORD";
			request.setAttribute("MSG",msg);
			result="login.jsp";
			
			 }
	
		RequestDispatcher rd=request.getRequestDispatcher(result);
		rd.forward(request, response);
		
		
	}

}