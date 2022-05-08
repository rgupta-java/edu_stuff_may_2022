package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("inside servlet A");
		HttpSession httpSession=request.getSession();
		
		httpSession.setAttribute("name", "raj");
		
		response.sendRedirect("B");
		//RequestDispatcher rd=request.getRequestDispatcher("https://www.google.com/");
		//out.flush();
		//rd.forward(request, response);
		out.print("back inside servlet A");
	}

}
