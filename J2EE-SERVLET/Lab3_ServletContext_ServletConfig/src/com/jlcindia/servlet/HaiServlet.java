package com.jlcindia.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HaiServlet extends HttpServlet {

	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{

		System.out.println("service method of Hai servlet");
		
		String n=req.getParameter("name");
		String p=req.getParameter("phone");
		
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		
		
		out.write("<h1>Response from Hai Servlet");
		out.write("<h1>Request Parameters");
		out.write("<br/>Fname"+n);
		out.write("<br/>phone"+p);
		
		
		ServletConfig cfg=getServletConfig();
		String eml=getInitParameter("email");
		out.write("<br/>"+cfg);
		
		out.write("<br/>web"+eml);
		out.write("<hr/>Servlet context parameter");
		ServletContext ctx=cfg.getServletContext();
		String web=ctx.getInitParameter("website");
		out.write("<br/>"+ctx);
		out.write("<br/>"+web);
		
	}
	
	
}
