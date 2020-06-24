package com.sbs.java.blog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home/main")
public class HomeMainServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		int dan = Integer.parseInt(request.getParameter("dan"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		
		response.getWriter().append("<h1>구구단" + dan + "단</h1>" );
		for ( int i = 1; i <= limit; i++ ) {
			response.getWriter().append("<div>" + dan + " * " + i + " = " + dan*i + "</div>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
