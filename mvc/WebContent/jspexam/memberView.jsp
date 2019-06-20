<%@page import="model.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name, id, password, phone;
		name = ((MemberVO) request.getAttribute("mv")).getName();
		id = ((MemberVO) request.getAttribute("mv")).getId();
		password = ((MemberVO) request.getAttribute("mv")).getPassword();
		phone = ((MemberVO) request.getAttribute("mv")).getPhone();
	%>
	<h1>
		<Strong>회원 정보</Strong>
	</h1>
	<hr>
	<ul>
		<li>회원 이름 : <%=name%></li>
		<li>회원 계정 : <%=id%></li>
		<li>회원 암호 : <%=password%></li>
		<li>회원 전화번호: <%=phone%></li>
	</ul>
</body>
</html>
