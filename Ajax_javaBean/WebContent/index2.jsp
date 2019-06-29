<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function ajax_1(va) {
		//创建xmlHTTPreques请求对象
		var xmlhttp;
		if(window.XMLHttpRequest){
			xmlhttp = new XMLHttpRequest();
			}else{
				xmlhttp = new ActiveXObiject("Microsoft.XMLHTTP");
				}
		//向服务器发出请求
		xmlhttp.open("GET", "Se1?key="+va, false);
		xmlhttp.send();
		//获取服务器响应
		var str = xmlhttp.responseText;

		 if (str == 1) {
		//设置文本的内容
		document.getElementById("i1").innerHTML = "用户名可用";
		}else {
		document.getElementById("i1").innerHTML= "用户已经存在";
		}
		//alert(str);
			
	}	
</script>
</head>
<body>
	<form action="">
		名字：<input type="text"onblur="ajax_1(this.value)"><font  id = "i1"></font><hr>
		爱好:<input type="text">
	</form>
</body>
</html>