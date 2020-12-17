<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_parameter.jsp</title>
</head>
<body>

	<a href="param.do?cate=book&kind=it">요청 시 파라미터 전송</a>
	<br />
	<a href=""></a>

	<h1>login</h1>
	
	<form action="login.do">
		id : <input type="text" name="id"><br /> 
		password : <input	type="password" name="password"><br /> 
		<input type="submit" value="login">
	</form>

</body>
</html>