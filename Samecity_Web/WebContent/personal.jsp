<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#search{
 margin-left: 30%;
 margin-right:25%;
 margin-top: 25px;
}
</style>
</head>
<body> 
<%
if (request.getSession().getAttribute("username")==null){
	response.sendRedirect("/Samecity_Web/Login.html");
}
%>
<ul class="nav nav-tabs nav-justified">
  <li role="presentation" class="active"><a href="#">Home</a></li>
  <li role="presentation"><a href="#">order</a></li>
  <li role="presentation"><a href="#">message</a></li>
</ul>

<div class="input-group" id="search">
  <span class="input-group-addon"><a href="/Samecity_Web/break"><%=request.getSession().getAttribute("username")%></a></span>
  <input type="text" class="form-control" aria-label="Amount (to the nearest dollar)" placeholder="           order message....">
  <span class="input-group-btn">
        <button class="btn btn-default" type="button">Go!</button>
  </span>
</div>
</body>
</html>