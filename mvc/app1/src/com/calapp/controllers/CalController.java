package com.calapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calapp.service.Calculator;

public class CalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//---controller : take data from the user ... do server side valiation . convert the data type etc
		Integer x=Integer.parseInt(request.getParameter("x").trim());
		Integer y=Integer.parseInt(request.getParameter("y").trim());
		
		//it take help of model layer 
		Integer sum=Calculator.sum(x, y);
		
		//it delegate to view layer ( ie jsp to show the data
		request.setAttribute("sum", sum);
		//RequestDispatcher vs redirect
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("show.jsp");
		requestDispatcher.forward(request, response);
		
		
	}

}
