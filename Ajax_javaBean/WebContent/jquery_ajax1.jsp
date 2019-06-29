<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="jquery-3.3.1.js"></script>
	<script type="text/javascript">
	/* responseTxt - 包含调用成功时的结果内容
	statusTXT - 包含调用的状态
	xhr - 包含 XMLHttpRequest 对象 */
		$(document).ready(function () {
			$("#b1").click(function () {
				$("#p1").load("text.txt",function(responseTxt,statusTxt,xhr){
					alert(responseTxt);//文本内容
					alert(statusTxt);//请求是否成功
					alert(xhr);//request对象
			});
		});
		//----------get----------
		$("#b2").click(function () {
			$.get("text.txt",function(data,status){
				alert(data+"："+status);
				//在此处给p1标签设置内容
				$("#p1").text(data);
				});
			});
		//----------post----------
		$("#b3").click(function () {
			$.post("text.txt",{
					name:"admin"
				},function(data,status){
				alert(data+"："+status);
				//在此处给p1标签设置内容
				$("#p1").text(data);
				});
			});
		});
	</script>
</head>
<body>
	<p id="p1">等待触发ajax内容</p>
	<button id="b1">点击按钮</button>
	<button id="b2">点get</button>
	<button id="b3">点post</button>
</body>
</html>