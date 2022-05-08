package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//by default servlet is loaded lazyly
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//can be have a servlet with default ctr? NO Why
	
	public HelloController() {
		System.out.println("ctr ");
	}


	@Override
	public void init() throws ServletException {
		System.out.println("inside init method ");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inside doGet");
	}
	
	@Override
	public void destroy() {
		System.out.println("inside destroyed");
	}

	
}
