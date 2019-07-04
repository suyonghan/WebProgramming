<%@page import="java.util.HashMap"%>
<%@page import="vo.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
a {
	background: linear-gradient(to left, yellow, pink, Green);
}
</style>
<title>Insert title here</title>
</head>
<body>
	<%
		HashMap<String, Integer> hm = null;
		if (session.getAttribute("product") == null)
			;
		else {
			hm = ((ProductVO) session.getAttribute("product")).getinfo();
		}
	%>
	<h1>
		<Strong>선택한 상품정보는 다음과 같습니다</Strong>
	</h1>
	<hr>
	<ul>
		<%
			if (hm != null) {
				for (String key : hm.keySet()) {
		%>
		<li>선택한 <%=key%>의 갯수: <%=hm.get(key)%></li>
		<%
			}
			} else {
		%>
		<li>장바구니가 비었습니다.</li>
		<%
			}
		%>
	</ul>
	<hr>
	<a href="http://localhost:8000/springedu/resources/product.html">선택화면으로</a>
</body>
</html>
