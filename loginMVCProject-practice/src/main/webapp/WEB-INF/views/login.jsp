<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<div align="center">
		<h3>로그인</h3>
		<form action="login" method="post">
			<input type="text" name="id" id="id" placeholder="아이디를 입력하세요" /><br />
			<input type="password" name="pw" id="pw" placeholder="비밀번호를 입력하세요" /><br />
			<input type="submit" value="로그인" />
		</form>
	</div>
</body>
</html>