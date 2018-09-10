package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CurrencyConvertor")
public class CurrencyConvertorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public CurrencyConvertorServlet() {
        super();
    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Dollar to Rupees Conversion:</h1>");
		out.println("<table border='1'><tr> <th>Dollar</th> <th>Rupees</th></tr>");
		for(int i=1;i<=50;i++)
		{
			out.println("<tr><td>"+i+"</td><td>"+45*i+"</td></tr>");
		}
		out.println("</table>");
	}
}
