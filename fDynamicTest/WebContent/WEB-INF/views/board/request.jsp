<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request.jsp</title>
<link href="/fDynamicTest/css/requestCss.css" rel="stylesheet" type="text/css"> 
</head>
<body>

request.jsp 뷰 페이지<br/>
<hr/>
아이디 : ${memberVO.id}<br/>
이름 : ${memberVO.name}<br/>
나이 : ${memberVO.age}<br/>

<img alt="절대경로" src="/fDynamicTest/img/tiger.jpg">
<img alt="상대경로" src="../img/tiger.jpg">


</body> 
</html>