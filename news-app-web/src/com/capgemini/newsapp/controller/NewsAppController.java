package com.capgemini.newsapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/NewsAppController")
public class NewsAppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewsAppController() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String newsName=request.getParameter("value");
		if(newsName.equals("toi"))
			response.sendRedirect("https://timesofindia.indiatimes.com/");
		if(newsName.equals("dna"))
			response.sendRedirect("https://www.dnaindia.com/");
		if(newsName.equals("et"))
			response.sendRedirect("https://economictimes.indiatimes.com/");
		if(newsName.equals("mt"))
			response.sendRedirect("https://maharashtratimes.indiatimes.com/");
	}

}
