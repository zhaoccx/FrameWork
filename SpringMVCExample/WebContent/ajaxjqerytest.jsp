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
<script type="text/javascript" src="/jquery/jquery-3.0.0.js"></script>


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
	<script type="text/javascript">
		document.getElementById("save").onclick = function() {
			var request = new XMLHttpRequest();
			request.open("POST", "springajax/ajaxpost");
			var data = "username=" + document.getElementById("staffName").value + "&password=" + document.getElementById("staffNumber").value + "&email=" + document.getElementById("staffSex").value + "&age=" + document.getElementById("staffJob").value;
			request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");//post提交设置项
			request.send(data);
			request.onreadystatechange = function() {
				if (request.readyState === 4) {
					if (request.status === 200) {
						if (request.responseText) {
							document.getElementById("createResult").innerHTML = request.responseText;
						} else {
							document.getElementById("createResult").innerHTML = "出现错误：";
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