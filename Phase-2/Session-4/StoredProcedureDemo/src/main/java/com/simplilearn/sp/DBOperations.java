package com.simplilearn.sp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBOperations
 */
@WebServlet("/dbop")
public class DBOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		
		Connection conn= DBCOnfig.getConnect(prop);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>database Operations</h1>");
		try {
			Statement stmt=conn.createStatement();
			stmt.execute("create database sample");
			out.print("databse created<br>");
			
			stmt.execute("use sample");
			out.print("databse selected and changed<br>");
			
			stmt.execute("drop database sample");
			out.print("databse dropped<br>");
			
			stmt.close();
			conn.close();
			out.print("Connection closed<br>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
