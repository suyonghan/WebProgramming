<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
span {
	color: red;
}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int result;
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		char op = request.getParameter("op").charAt(0);
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			result = 0;
			break;
		}
	%>
	<h1>
		<strong>연산요청 결과</strong>
	</h1>
	<hr>
	<p>
		결과 :<strong><span><%=result%></span></strong>
	</p>
	<a href="http://localhost:8000/mvc/htmlexam/calcForm.html">입력화면</a>
</body>
</html>