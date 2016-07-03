<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body, input, select, button, h1 {
	font-size: 28px;
	line-height: 1.7;
}
</style>
</head>
<body>
	<h1>员工查询</h1>

	<label>请输入员工编号：</label>
	<input type="text" id="keyword" />
	<button id="search">查询</button>
	<p id="searchResult"></p>

	<h1>员工新建</h1>
	<label>请输入员工姓名：</label>
	<input type="text" id="staffName" />
	<br>
	<label>请输入员工编号：</label>
	<input type="text" id="staffNumber" />
	<br>
	<label>请选择员工性别：</label>
	<select id="staffSex">
		<option>女</option>
		<option>男</option>
	</select>
	<br>
	<label>请输入员工职位：</label>
	<input type="text" id="staffJob" />
	<br>
	<button id="save">保存</button>
	<p id="createResult"></p>

	<script>
		document.getElementById("search").onclick = function() {
			debugger;
			var request = new XMLHttpRequest();
			request.open("GET", "/springajax/ajaxget");
			request.send();
			request.onreadystatechange = function() {
				if (request.readyState === 4) {
					if (request.status === 200) {
						var data = JSON.parse(request.responseText);
						if (data.success) {
							document.getElementById("searchResult").innerHTML = data.msg;
						} else {
							document.getElementById("searchResult").innerHTML = "出现错误：" + data.msg;
						}
					} else {
						alert("发生错误：" + request.status);
					}
				}
			}
		}

		document.getElementById("save").onclick = function() {
			var request = new XMLHttpRequest();
			request.open("POST", "serverjson.php");
			var data = "name=" + document.getElementById("staffName").value + "&number=" + document.getElementById("staffNumber").value + "&sex=" + document.getElementById("staffSex").value + "&job=" + document.getElementById("staffJob").value;
			request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
			request.send(data);
			request.onreadystatechange = function() {
				if (request.readyState === 4) {
					if (request.status === 200) {
						var data = JSON.parse(request.responseText);
						if (data.success) {
							document.getElementById("createResult").innerHTML = data.msg;
						} else {
							document.getElementById("createResult").innerHTML = "出现错误：" + data.msg;
						}
					} else {
						alert("发生错误：" + request.status);
					}
				}
			}
		}
	</script>
</body>
</html>