<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="jquery-3.3.1.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#b1").click(function() {
				$.get("Servlet_1?name=admin",function(data,status){
					alert(data);
				});
			});
			$("#b2").click(function() {
				$.post("Servlet_1",{
					name:"password"
					},function(data,status){
					alert(data);
				});
			});
		});
	</script>
</head>
<body>
	<button id="b1">点击按钮</button>
	<button id="b2">POST</button>
</body>
</html>