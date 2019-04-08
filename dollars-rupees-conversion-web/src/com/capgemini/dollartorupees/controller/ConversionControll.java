package com.capgemini.dollartorupees.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class ConversionControll extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public ConversionControll() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path=request.getServletPath();
		if(path.equals("/dollarstorupees.do")) {
			PrintWriter writer = response.getWriter();
			writer.println("<h2>conversion...!!!<h2>");
			writer.close();
		}
	}

}
