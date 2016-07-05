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
<!-- <script type="text/javascript" src="https://code.jquery.com/jquery-3.0.0.min.js"></script> -->
<script type="text/javascript" src="js/jquery-3.0.0.min.js"></script>


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
		$(function() {
			$("#search").click(function() {
				$("#searchResult").load("springajax/ajaxget-" + $("#keyword").val(), null, function(data) {
					if (data) {
						$("#searchResult").val(data);
					}
				});
			});

			$("#save").click(function() {
				var args = {
					username : $("#staffName").val(),
					password : $("#staffNumber").val(),
					email : $("#staffSex").val(),
					age : $("#staffJob").val()
				};
				//$.post("springajax/ajaxpost", args, function(data) {
				//	debugger;
				//	if (data) {
				//		$("#createResult").append(data);
				//	}
				//});

				$.ajax({
					type : "POST",
					url : "springajax/ajaxpost",
					data : {
						username : $("#staffName").val(),
						password : $("#staffNumber").val(),
						email : $("#staffSex").val(),
						age : $("#staffJob").val()
					},
					//dataType : "json",
					success : function(datas) {
						//	debugger;
						if (datas) {
							$("#createResult").append(datas);
						}
					},
					error : function(datas) {
						//	debugger;
						alert("有异常：" + datas);
					}
				});
			});

		});
	</script>
</body>
</html>