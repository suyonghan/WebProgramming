
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Result of processing the view</h1>
	<hr>
	<%
		String result = (String) request.getAttribute("msg");
	%>
	expressing tag :
	<%=result%>
	<hr>
	EL : ${msg }
</body>
</html>
