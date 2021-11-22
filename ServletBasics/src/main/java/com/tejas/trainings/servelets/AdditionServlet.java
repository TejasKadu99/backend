package com.tejas.trainings.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
if(request.getParameter("number1")!=null&&request.getParameter("number2")!= null) {
	 long num1 = Long.parseLong(request.getParameter("number1"));	
	 long num2 = Long.parseLong(request.getParameter("number2"));	
//     long sum = num1 + num2;
	 PrintWriter out = response.getWriter();
	 out.println("The Result Is " + (num1 + num2));
	}

}

}