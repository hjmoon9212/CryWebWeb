<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>01_autoScan.jsp</title>
</head>
<body>

<h1> 요청 연습</h1>
<a href="board/a.do">요청1</a><br/>
<a href="board/b.do">요청2</a><br/>
<a href="board/c.do?id=kim">요청3</a><br/>
<a href="board/c.do">요청4</a><br/>

<hr/>
<h2>폼 요청</h2>
post
<!-- 상대경로 : board/request.do -->
<form action="/fDynamicTest/board/request.do" method="post">
	<%--  name 부여시 중요!!! MemberVO의 멤버명과 동일!!  --%>
	번호 : <input type="text" name="id"><br/>
	이름 : <input type="text" name="name"><br/>
	나이 : <input type="text" name="age"><br/>
	<input type="submit" value="전송">
</form>
get
<form action="/fDynamicTest/board/request.do" method="get">
	<%--  name 부여시 중요!!! MemberVO의 멤버명과 동일!!  --%>
	번호 : <input type="text" name="id"><br/>
	이름 : <input type="text" name="name"><br/>
	나이 : <input type="text" name="age"><br/>
	<input type="submit" value="전송">
</form>
</body>
</html>