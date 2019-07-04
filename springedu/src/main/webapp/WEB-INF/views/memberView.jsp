<%@page import="vo.MemberVO"%>
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
		String na, idd, pw, ph;
		na = ((MemberVO) request.getAttribute("mv")).getName();
		idd = ((MemberVO) request.getAttribute("mv")).getId();
		pw = ((MemberVO) request.getAttribute("mv")).getPassword();
		ph = ((MemberVO) request.getAttribute("mv")).getPhone();
	%>
	<h1>
		<Strong>회원 정보(스크립트 태그)</Strong>
	</h1>
	<hr>
	<ul>
		<li>회원 이름 : <%=na%></li>
		<li>회원 계정 : <%=idd%></li>
		<li>회원 암호 : <%=pw%></li>
		<li>회원 전화번호: <%=ph%></li>
	</ul>
	<hr>
</body>
</html>
