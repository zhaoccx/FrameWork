<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<br><br>
	<a href="springmvc/testRedirect">test testRedirect</a>
	<br><br>
	<a href="springmvc/testView">test testView</a>
	<br><br>
	<a href="springmvc/testViewAndViewResolver">test testViewAndViewResolver</a>
	
	<br><br>
	<form action="springmvc/testModelAttributes" method="post">
		<input type="hidden" name="id" value="1"/>
		username:<input type="text" name="username" value="ssss"/><br>
		email:<input type="text" name="email" value="ininin"/><br>
		age:<input type="text" name="age" value="34"/><br>
		<input type="submit" value="submit"/>
	</form>


	<br><br>
	<a href="springmvc/testSessionAttribute">testSessionAttribute</a>

	<br><br>
	<a href="springmvc/testMap">testMap</a>

	<br><br>
	<form action="springmvc/testModelAndViews" method="post">
		username:<input type="text" name="username"/><br>
		password:<input type="password" name="password"/><br>
		email:<input type="text" name="email"/><br>
		age:<input type="text" name="age"/><br>
		provice:<input type="text" name="address.provice"/><br>
		city:<input type="text" name="address.city"/><br>
		street:<input type="text" name="address.street"/><br>
		county:<input type="text" name="address.county"/><br>
		team:<input type="text" name="address.team"/><br>
		<input type="submit" value="submit"/>
	</form>

	<br><br>
	<a href="springmvc/testModelAndView">testModelAndView</a>

	<br><br>
	<a href="springmvc/testServlets">testServlets</a>

	<br><br>
	<a href="springmvc/testServlet">testServlet</a>

	<br><br>
	<form action="springmvc/testPOJO" method="post">
		username:<input type="text" name="username"/><br>
		password:<input type="password" name="password"/><br>
		email:<input type="text" name="email"/><br>
		age:<input type="text" name="age"/><br>
		provice:<input type="text" name="address.provice"/><br>
		city:<input type="text" name="address.city"/><br>
		street:<input type="text" name="address.street"/><br>
		county:<input type="text" name="address.county"/><br>
		team:<input type="text" name="address.team"/><br>
		<input type="submit" value="submit"/>
	</form>

	<br><br>
	<a href="springmvc/testCookieValue">testCookieValue</a>
	
	<br><br>
	<a href="springmvc/testRequestheader">testRequestheader</a>
	
	<br><br>
	<a href="springmvc/testRequestParams?username=spring&age=45">testRequestParams</a>

	<br><br>
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="PUT">
		<input type="submit" value="PUT">
	</form>
	<br><br>
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="DELETE">
		<input type="submit" value="DELETE">
	</form>
	<br><br>
	<form action="springmvc/testRest" method="post">
		<input type="submit" value="POST">
	</form>
	<br><br>
	<a href="springmvc/testRest/1">testRest</a>
	
	
	<br><br>
	<a href="springmvc/testPathAreable/90">testPathAreable</a>
	<br>
	<a href="springmvc/testAntPath/ererre/abc">testAntPath</a>
	<br>
	<a href="springmvc/testParamsAndHead?username=spring&age=12">testParamsAndHead</a>
	
	<br>
	<form action="springmvc/testMethed" method="post">
		<input type="submit" value="提交">
	</form>

	<br>

	<a href="helloworld">hello world</a>
	<br>
	<a href="springmvc/testRequestMVCMapping">testRequestMVCMapping</a>
	<br>
	<a href="springmvc/testMethed">testMethed</a>
</body>
</html>