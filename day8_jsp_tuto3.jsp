<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<%
			char[] day = { '일', '월', '화', '수', '목', '금', '토' };
			Calendar c = Calendar.getInstance();

			if (request.getMethod().equals("POST"))
				request.setCharacterEncoding("UTF-8");
		%>
		<%=request.getParameter("name")%>님 반가워요... 오늘은 <%=day[c.get(Calendar.DAY_OF_WEEK) - 1]%>요일입니다!!
	</h2>
</body>
</html>