<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int dan = (int)request.getAttribute("dan");
int limit = (int)request.getAttribute("limit");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
	<h1>구구단 ${name} 출력</h1>
	<div>
		<% for (int i = 1; i <= limit; i++ ) { %>
			<div>
				<%=dan%> * <%=i%> = <%=dan * i%>
			</div>
		<% } %>
	</div>

</body>
</html>