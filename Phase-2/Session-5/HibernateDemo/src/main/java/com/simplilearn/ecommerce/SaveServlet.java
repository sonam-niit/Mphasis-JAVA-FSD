package com.simplilearn.ecommerce;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session=factory.openSession();		
		Transaction tx= session.beginTransaction();
		Customer cust= new Customer("Supriya","sup@gmail.com","sp@123");
		session.save(cust);
		tx.commit();
		session.close();
		response.getWriter().print("Data Inserted");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
