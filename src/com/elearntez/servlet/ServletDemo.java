package com.elearntez.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet{
	
	public ServletDemo(String args) {
		
	}

	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    System.out.println("Hello My Dear Friend. Welcome to Servelt");
		super.doGet(req, resp);
	}
}

