package com.simplilearn.sp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);
		
		String fname="Nandita";
		String lname="Smith";
		String email="nandita@gmail.com";
		String password="smith@123";
		
		if(conn!=null)
		{
			try {
				CallableStatement stmt= conn.prepareCall("{call add_studen(?,?,?,?)}");
				stmt.setString(1, fname);
				stmt.setString(2, lname);
				stmt.setString(3, email);
				stmt.setString(4, password);
				
				int rs=stmt.executeUpdate();
				
				if(rs>0)
					out.println("Data inserted successfully");
				else
					out.print("error while inserting a data");
				
			} catch (SQLException e) {
				//error handling using SQLException
				//e.printStackTrace();
				System.out.println("Error code "+e.getErrorCode());
				System.out.println("Message: "+e.getMessage());
				System.out.println("SQL State: "+e.getSQLState());
				
				e.printStackTrace(out);
			}
			
		}
		else
			out.print("Error while connecting with database");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
