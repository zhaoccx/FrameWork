<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#testJson").click(function() {
			var url = this.href;
			var args = {};
			$.post(url, args, function(data) {
				for (var index = 0; index < data.length; index++) {
					var id = data[index].id;
					var lastName = data[index].lastName;
					alert(id + ": " + lastName);
				}
			});
			return false;
		});
	});
</script>
</head>
<body>
	<a href="mvccrud/emplist">go to list employees</a>

	<br />
	<br />
	<a href="mvccrud/testJson" id="testJson">Test Json</a>

	<br />
	<br />

	<form action="mvccrud/testHttpMessageConverter" method="post" enctype="multipart/form-data">
		File : <input type="file" name="file" /> Desc:<input type="text" name="desc" /> <input type="submit" value="Submit" />
	</form>

	<br />
	<br />
	<a href="mvccrud/testResponseEntity">Test testResponseBody</a>
	<br />
	<br />
	<a href="i18n">i18n page</a>

	<br />
	<br />
	<a href="mvccrud/testI18n">Test i18n</a>

















</body>
</html>