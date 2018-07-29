<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'insert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form method="post" action="flowerServlet?opr=insert">
	<table border=1>
		<tr>
			<th>花卉信息添加</th>
		</tr>
		<tr>
			<td>花卉名称</td>
			<td><input id="name" name="name" type="text"></td>
		</tr>
		<tr>
			<td>花卉别称</td>
			<td><input id="aname" name="aname" type="text"></td>
		</tr>
		<tr>
			<td>花卉科属</td>
			<td><input id="keshu" name="keshu" type="text"></td>
		</tr>
		<tr>
			<td>价格(元/束)</td>
			<td><input id="price" name="price" type="text"></td>
		</tr>
		<tr>
			<td>原产地</td>
			<td><input id="add" name="add" type="text"></td>
		</tr>
		<tr>
			<td><button type="submit">添加</button> <button id="qingko">重置</button></td>
		</tr>
	</table>
	</form>
	<script type="text/javascript">
	
	</script>
  </body>
</html>
