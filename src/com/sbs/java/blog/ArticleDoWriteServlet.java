package com.sbs.java.blog;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s/article/doWrite")
public class ArticleDoWriteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		String url = "jdbc:mysql://site34.iu.gy:3306/site34?serverTimezone=Asia/Seoul&useOldAliasMetadataBehavior=true";
		String user = "site34";
		String password = "sbs123414";
		String driverName = "com.mysql.cj.jdbc.Driver";

		Connection connection;

		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, user, password);
			response.getWriter().append("연결되었습니다.");
		} catch (SQLException e) {
			System.err.printf("[SQL 예외] : %s\n", e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.printf("[드라이버 클래스 로딩 예외] : %s\n", e.getMessage());
		}
		
		request.getRequestDispatcher("/jsp/s/home/board1.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}