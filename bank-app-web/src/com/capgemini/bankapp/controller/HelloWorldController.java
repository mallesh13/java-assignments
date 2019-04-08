package com.capgemini.bankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloWorld", loadOnStartup = 0, urlPatterns = { "/HelloWorldController", "/login" })
public class HelloWorldController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloWorldController() {
		System.out.println("Object Created");

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		System.out.println("hello world");

		PrintWriter out = response.getWriter();
		out.println("hello...");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		// PrintWriter writer=response.getWriter();
		RequestDispatcher dispatcher;
		
		if (username.equals("root") && password.equals("root")) {
			dispatcher = request.getRequestDispatcher("success.html");

		} else
			dispatcher = request.getRequestDispatcher("error.html");
		dispatcher.forward(request, response);
		// writer.close();
	}

}
