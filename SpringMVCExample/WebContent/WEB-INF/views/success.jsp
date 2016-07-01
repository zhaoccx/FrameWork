<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Seccess Page</h4>
	request time : ${requestScope.time};
	<br />
	<form action="springmvc/testPOJO" method="post">
		username:<input type="text" name="username"/><br>
		password:<input type="password" name="password"/><br>
		email:<input type="text" name="email" value="${requestScope.user.email}"/><br>
		age:<input type="text" name="age"/><br>
		provice:<input type="text" name="address.provice"/><br>
		city:<input type="text" name="address.city"/><br>
		street:<input type="text" name="address.street" value="${requestScope.user.address.street}"/><br>
		county:<input type="text" name="address.county"/><br>
		team:<input type="text" name="address.team"/><br>
		<input type="submit" value="submit"/>
	</form>
	<br />
	session time : ${sessionScope.time};
	
	<br />
	<br />
	request time : ${requestScope.user};
	
	<br />
	<br />
	<br />
	session time : ${sessionScope.user};
	
	
	<br />
	<br />
	<br />
	
</body>
</html>