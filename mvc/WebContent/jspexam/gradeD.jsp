<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<h1><%=request.getParameter("name")%>님은 D등급입니다... 꾸준히 노력하세요.</h1>
	<a href="http://localhost:8000/mvc/htmlexam/eduForm.html">입력화면으로</a>
</body>
</html>