package com.netprise;

import java.util.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;
import com.netprise.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserService {

	
	public int verifyUser(String un,String pw) {
		
		int x=0;
		
		PreparedStatement ps =null;
		Connection con=null;
		ResultSet rs=null;
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
		 // loads driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/NETPRISE", "root", "root"); // gets a new connection
 
	 ps = c.prepareStatement("select user_name,password from users where user_name=? and password=?");
		ps.setString(1, un);
		ps.setString(2, pw);
 
		 rs = ps.executeQuery();
 if(rs.next())
	 x=1;

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(rs, ps, con);
		}
		return x;
		
	}
	
	//------------------------------------------
	
	
	public String getPasswordByEmail(String em) {
		String pw=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			con=JDBCUtil.getMySQLConnection();
			String sql="select password from users where email=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,em);
			rs=ps.executeQuery();
			if(rs.next())
				pw=rs.getString(1);
			System.out.println(pw);
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCUtil.cleanup(rs, ps, con);
		}
		
		return pw;
		
	}
	
	
	
	public int addProduct(String p,String u) {
		int x=0;
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			
			con=JDBCUtil.getMySQLConnection();
			String sql="insert into placedorder values(?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1,p);
			ps.setString(2,u);
			x=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			JDBCUtil.cleanup(ps, con);
		}
		
		
		return x;
	}
	
	
	
}
