<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试Spring开始页面</title>
</head>
<body>

	<form action="springmvc/testModelAttribute" method="post">
		<input type="hidden" name="id" value="1" />
		private String username<input type="text" name="username" value="Tonse" /><br> 
		private String email <input type="text"	name="email" value="abc@163.com" /><br> 
		private int age<input type="text" name="age" value="34" /><br> 
		<input type="submit" value="Submit" />
	</form>
	<br>
	<br>
	<a href="springmvc/testSessionAttributes">Hello SessionAttributes</a>
	<br>
	<br>
	<a href="springmvc/testMap">Hello testtestMap</a>
	<br>
	<br>
	<a href="springmvc/testModelAndView">Hello testModelAndView</a>
	<br>
	<br>
	<a href="springmvc/testServletAPIout">Hello testServletAPIout</a>
	<br>
	<br>
	<a href="springmvc/testServletAPI">Hello testServletAPI</a>
	<br>
	<br>
	<a href="helloworld">Hello World</a>
	<br>
	<br>
	<a href="springmvc/mymvc">Hello Test</a>
	<br>
	<br>
	<a href="springmvc/myMethed">Hello mehted</a>

	<form action="springmvc/myMethed" method="post">
		<input type="submit" value="submit" />
	</form>

	<br>
	<br>
	<a href="springmvc/requestParamsAndHandler?username='sss'&age=11">Hello
		mehted</a>

	<br>
	<br>
	<a href="springmvc/testAnt/dddfd/abc">Hello testAnt</a>

	<br>
	<br>
	<a href="springmvc/requestAviable/333/sed">Hello requestAviable</a>


	<br>
	<br>
	<a href="springmvc/requestRest/2">Hello requestRest</a>

	<br>
	<br>

	<form action="springmvc/requestRest/2" method="post">
		<input type="submit" value="TestRest Post">
	</form>

	<br>
	<br>

	<form action="springmvc/requestRest/2" method="post">
		<input type="hidden" name="_method" value="DELETE"> <input
			type="submit" value="TestRest DELETE">
	</form>
	<br>
	<br>
	<form action="springmvc/requestRest/2" method="post">
		<input type="hidden" name="_method" value="PUT"> <input
			type="submit" value="TestRest PUT">
	</form>
	<br>
	<br>
	<a href="springmvc/testRequestParam?us=abc&age=45">Hello
		testRequestParam</a>
	<br>
	<br>
	<form action="springmvc/testRequestParam" method="post">
		<input type="text" name="username" /> <input type="password"
			name="age" /> <input type="submit" value="TestRest testRequestParam" />
	</form>

	<br>
	<br>
	<a href="springmvc/testRequestHeader">Hello testRequestHeader</a>
	<br>
	<br>
	<a href="springmvc/testCookieValue">testCookieValue</a>
	<br>
	<br>
	<form action="springmvc/testPojo" method="post">
		private String username<input type="text" name="username" /><br>
		private String password<input type="password" name="password" /><br>
		private String email<input type="text" name="email" /><br>
		private int age<input type="text" name="age" /><br> private
		Address address<br>private String provice<input type="text"
			name="address.provice" /><br> private String city<input
			type="text" name="address.city" /><br> private String county<input
			type="text" name="address.county" /><br> <input type="submit"
			value="Submit" />

	</form>
</body>
</html>