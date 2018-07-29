<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="org.entity.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%
		List<flower> list=(List<flower>)request.getSession().getAttribute("list");
		if(list==null){
			response.sendRedirect("flowerServlet?opr=select");
		}
	 %>
  </head>
  <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
  <script type="text/javascript">
  	
  </script>
  
  <body>
  <div>
  <button><a href="insert.jsp">添加花卉信息</a></button>
	<table border=1>
		<tr>
			<th>花卉编号</th>
			<th>花卉名称</th>
			<th>花卉别称</th>
			<th>花卉科属</th>
			<th>花卉价格</th>
			<th>花卉产地</th>
		</tr>
		<c:forEach  var="msg" items="${list}">
			<tr>
				<td>${msg.id}</td>
				<td>${msg.name}</td>
				<td>${msg.anothername}</td>
				<td>${msg.property}</td>
				<td>${msg.price}</td>
				<td>${msg.production}</td>
				
			</tr>
		</c:forEach>
	</table>
	</div>
  </body>
</html>
