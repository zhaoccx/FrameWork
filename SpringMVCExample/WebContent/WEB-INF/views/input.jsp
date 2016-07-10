<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action=""></form>


	<form:form action="${pageContext.request.contextPath}/mvccrud/emp" method="POST" modelAttribute="employee">
		<c:if test="${employee.id == null }">
			lastName:<form:input path="lastName" />
		</c:if>
		<c:if test="${employee.id != null }">
			<form:hidden path="id" />
			<input type="hidden" name="_method" value="PUT" />
		</c:if>
		<br />
		email:<form:input path="email" />
		<br />
		gender:<form:radiobutton path="gender" value="1" label="Male" />
		<form:radiobutton path="gender" value="0" label="FaMale" />
		<br />
		department:<form:select path="department.id" items="${departments }" itemValue="id" itemLabel="departmentName"></form:select>
		<br />
		birth:<form:input path="birth" />
		<br />
		salary:<form:input path="salary" />
		<br />
		<form:button value="Sumbit">Sumbit</form:button>
	</form:form>
</body>
</html>