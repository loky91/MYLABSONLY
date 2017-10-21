package com.netprise;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class JDBCUtil {

	static {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			
		}catch(ClassNotFoundException ex) {
			System.out.println(ex);
			
		}
		
	}//static
	
	
	public static Connection getMySQLConnection() throws SQLException{
		String url="jdbc:mysql://localhost:3306/NETPRISE";
		Connection con=DriverManager.getConnection(url,"root","root");
		
		return con;
		
	}
	
	
	public static void cleanup(Statement st,Connection con) {
		
		try {
			if(st!=null)
				st.close();
			if(con!=null)
				con.close();
			
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
	}
	

	
	
		public static void cleanup(ResultSet rs,Statement st,Connection con) {
			
			try {
				if(rs!=null)
					rs.close();
				
				if(st!=null)
					st.close();
				if(con!=null)
					con.close();
				
				
			}catch(Exception e) {
				
				System.out.println(e);
			}
		
		
	}
		

		
		

	
}
