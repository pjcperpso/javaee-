<%@page import="com.itcity.bean.Title"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>A&b_maintopic</title>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/topichead.jsp"></jsp:include>
	<%
		StringBuffer data = (StringBuffer)request.getAttribute("data");
		Title title = (Title)request.getAttribute("onetitle");
		/* if(title!=null){ */
	%>
	<h1 style="font-family: '隶书';margin-left: 100px">
		题目:<%=title.getId() %>--<%=title.getName() %>
		<font style="margin-left: 200px;font-size: 25px">建议用时:<%=title.getTime()%>min </font>
	</h1>
	<h4 style="margin-left: 50px;margin-right: 50px;margin-top: 20px;line-height: 35px;letter-spacing: 3px">
		<%=data %>
	</h4>
</div>
</body>
</html>