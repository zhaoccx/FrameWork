<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../jquery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function() {
		$(".delete").click(function() {
			$("form").attr("action", $(this).attr('href')).submit();
			return false;
		});
	});
</script>
</head>
<body>
	<form action="" method="POST">
		<input type="hidden" name="_method" value="DELETE" />
	</form>

	<a href="emp">add New employee</a>
	<br />
	<a href="myconvertest">add New employee</a>
	<br />
	<c:if test="${empty requestScope.employees}">
		没有员工
	</c:if>
	<c:if test="${!empty requestScope.employees}">
		<table border="2" cellpadding="10" cellspacing="5">
			<tr>
				<td>ID</td>
				<td>lastName</td>
				<td>email</td>
				<td>gender</td>
				<td>department</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>
			<c:forEach items="${requestScope.employees}" var="emp">
				<tr>
					<td>${emp.id }</td>
					<td>${emp.lastName }</td>
					<td>${emp.email }</td>
					<td>${emp.gender == '1' ? 'Male':'FaMale'}</td>
					<td>${emp.department.departmentName }</td>
					<td><a href="emp/${emp.id}">Edit</a></td>
					<td><a class="delete" href="emp/${emp.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>