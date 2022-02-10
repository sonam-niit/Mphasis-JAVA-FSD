package com.simplilearn.conf;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ConfigPara extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServletConfig config=null;
	private ServletContext context=null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		this.context=config.getServletContext();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=config.getInitParameter("username");
		out.print("Config Parameter UserName: "+user+"<br>");
		out.print("Servlet Name "+config.getServletName()+"<br>");
		
		String dbdriv=context.getInitParameter("dbdriver");
		out.println("DbDriver is "+dbdriv+"<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
