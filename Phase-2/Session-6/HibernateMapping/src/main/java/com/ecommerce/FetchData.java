package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/fetch")
public class FetchData extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session= factory.openSession();
		
		List<EProduct> list=session.createQuery("from EProduct").list();
		PrintWriter out= response.getWriter();
		for(EProduct product:list)
		{
			out.print("Id:" +product.getID()+"<br>");
			out.print("Name: "+product.getName()+"<br>");
			out.print("Price: "+product.getPrice().toString()+"<br>");
			out.print("Available From: "+product.getDateAdded()+"<br>");
			out.print("Color Details<br>");
			List<Color> colors=product.getColors();
			
			for(Color c:colors)
			{
				out.print("Color Name: "+c.getName()+"<br>");
			}
			out.print("ScreenSizes Details<br>");
			Collection<ScreenSizes> screens= product.getScreensizes();
			for(ScreenSizes c:screens)
			{
				out.print("Size: "+c.getSize()+"<br>");
			}
			out.print("OS Details<br>");
			Set<OS> os= product.getOs();
			for(OS c:os)
			{
				out.print("Size: "+c.getName()+"<br>");
			}
			out.print("Finance Details<br>");
			Map finance= product.getFinance();
			if(finance.get("CREDITCARD")!=null)
			{	
				Finance f=(Finance)finance.get("CREDITCARD");
				f.getName();
			}
			if(finance.get("BANK")!=null)
			{
				Finance f=(Finance)finance.get("BANK");
				f.getName();
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
