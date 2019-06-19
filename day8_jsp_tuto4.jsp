<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
	<h1>
		<strong>전달 된 내용</strong>
	</h1>
	<hr>
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String age = request.getParameter("age");
		String sex;
		if (request.getParameter("sex").equals("men"))
			sex = "남자";
		else
			sex = "여자";
		String[] hobby = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String[] food = request.getParameterValues("food");
		String comment = request.getParameter("comment");
		String secret1 = request.getParameter("hidden1");
		String secret2 = request.getParameter("hidden2");
	%>
	<h3>전달 된 내용</h3>
	<ul>
		<li>이름 : <%=name%></li>
		<li>암호 : <%=password%></li>
		<li>나이 : <%=age%></li>
		<li>성별 : <%=sex%></li>
		<%
			String temp = "";
			if (hobby == null) {
		%><li>취미 : 없음</li>
		<%
			} else {
				for (String s : hobby)
					temp += s + " ";
		%>
		<li>취미 : <%=temp%></li>
		<%
			}
			temp = "";
			if (color == "") {
		%>
		<li>종아하는 색 : 없음</li>
		<%
			} else {
		%>
		<li>좋아하는 색 : <%=color%> </li>
		<%
			}
			if (food == null) {
		%>
		<li>종아하는 음식 : 없음</li>
		<%
			} else {
				for (String s : food)
					temp += s + " ";
			}
		%>
		<li>종아하는 음식 : <%=temp%>
		</li>
		<li>의견 : <%=comment%>
		</li>
		<li>비밀1: <%=secret1%>
		</li>
		<li>비밀2 : <%=secret2%>
		</li>
	</ul>
	<br>
	<a href="http://localhost:8000/sedu/html/qeuryForm.html">입력화면으로</a>
</body>
</body>

</html>
