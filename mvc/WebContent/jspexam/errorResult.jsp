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
	<h1>
		<strong>요청을 처리하는 동안 오류가 발생했어요</strong>
	</h1>
	<hr>
	<p>
		오류의 원인 : <strong><span id="txt">나눗셈 연산시 두 번째 숫자는 0일 수
				없습니다!!</span></strong>
	</p>
	<a href="http://localhost:8000/mvc/htmlexam/calcForm.html">입력화면</a>
</body>
</html>