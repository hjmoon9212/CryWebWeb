<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>

parameter<br/>
${param.id}님 로그인 성공<br/>
<hr/>
user(VO)<br/>
${user.id}님 로그인 성공<br/>
<hr/>
session에서 로그인한 값 얻어오기<br/>
${sessionScope.login}님 로그인 성공<br/>

</body>
</html>