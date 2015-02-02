<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试Spring成功页面</title>
</head>
<body>
	<h4>Success Page</h4>

	<br> date : ${requestScope.time}
	<br>
	<br> requestScope.names : ${requestScope.names}
	<br>
	<br> sessionScope.user : ${sessionScope.user}
	<br>
	<br> requestScope.names : ${requestScope.names}
	<br>
	<br> sessionScope.user : ${sessionScope.user}
	<br>
	<br> sessionScope.time : ${sessionScope.time}
	<br>
</body>
</html>