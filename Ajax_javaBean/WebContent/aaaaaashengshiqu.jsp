<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>省市区三级联动下拉框 |Three - Three Linkage Drop-Down Box</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
 
<script type="text/javascript" src="<%=path%>/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/json.js"></script>
 
<style>
body {
	text-align: center;
}
</style>
 
</head>
 
<body>
	<select name="province" id="province" onchange="onSelectChange(this,'city');" style="width: 100px"></select>
	<select name="city" id="city" onchange="onSelectChange(this,'area');" style="width: 100px"></select>
	<select name="area" id="area" style="width: 100px"></select>
</body>
 
<script type="text/javascript">
  	 
  	function onSelectChange(obj,toSelId){
  	    setSelect(obj.value,toSelId);
  	}
 
  	function setSelect(fromSelVal,toSelId){
  	    jQuery.ajax({
  	      url: "<%=path%>/com/Dropdown",
			cache : false,
			data : {
				"code" : fromSelVal,
				"grade" : toSelId
			},
			success : function(data) {
				createSelectObj(data, toSelId);
			}
		});
	}
 
	function createSelectObj(data, toSelId) {
		var arr = JSON.parse(data);
		if (arr != null && arr.length > 0) {
			var obj = document.getElementById(toSelId);
			obj.innerHTML = "";
			var nullOp = document.createElement("option");
			nullOp.setAttribute("value", "");
			obj.appendChild(nullOp);
			for ( var o in arr) {
				var op = document.createElement("option");
				op.setAttribute("value", arr[o].code);
				op.appendChild(document.createTextNode(arr[o].name));
				obj.appendChild(op);
			}
		}
	}
 
	setSelect('110000', 'province');
</script>
</html>