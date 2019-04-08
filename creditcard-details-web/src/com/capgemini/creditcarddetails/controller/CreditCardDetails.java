package com.capgemini.creditcarddetails.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class CreditCardDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CreditCardDetails() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path=request.getServletPath();
		if(path.equals("/carddetails.do")) {
			
			  long cardNumber=Long.parseLong(request.getParameter("cardnumber")); 
			  String holderName=request.getParameter("holdername");
			  int expireMonth=Integer.parseInt(request.getParameter("expiremonth")); 
			  int expireYear=Integer.parseInt(request.getParameter("expireyear"));
			  int cvv=Integer.parseInt(request.getParameter("cvv")); 
			 RequestDispatcher dispatcher=request.getRequestDispatcher("creditcarddetails.jsp");
			 request.setAttribute("cardnumber",cardNumber);
			 request.setAttribute("holderName", holderName);
			 request.setAttribute("expireMonth", expireMonth);
			 request.setAttribute("expireYear", expireYear);
			 request.setAttribute("cvv", cvv);
			dispatcher.forward(request, response);
			
			
			
		}
	}

}
