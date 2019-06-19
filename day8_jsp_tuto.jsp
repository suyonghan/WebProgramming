<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jsp 맛보기</h1>
	<hr>
	<%
		int num = 10;
	%>
	<ul>
		<li><%=100%></li>
		<li><%=num%></li>
		<li><%=++num%></li>
		<li><%=num * 2%></li>
		<li><%="가나다".length()%></li>
		<li><%=num % 2 == 0%></li>
		<li><%=request.getParameter("stname")%></li>
		<li><%=new java.util.Date(session.getCreationTime())%></li>
	</ul>
</body>
</html>

<%--
스크립트 태그 : 필요한 자바 코드를 정의하는 용도의 태그들
<%= %> : 표현식
<% %> : 수행문


 --%>