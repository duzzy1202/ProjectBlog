package com.sbs.java.blog;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeDanServlet")
public class HomeDanServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/home/dan.jsp");
		int dan = Integer.parseInt(request.getParameter("dan"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		
		request.setAttribute("name", dan + "단");
		request.setAttribute("dan", dan);
		request.setAttribute("limit", limit);
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
