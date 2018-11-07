<%@page import="java.nio.channels.ShutdownChannelGroupException"%>
<%@page import="com.itcity.bean.Title"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>A&b_ssmalltopic</title>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</head>
<body background="#EFF4F7">
<!-- 头标签 -->
<jsp:include page="/WEB-INF/jsp/topichead.jsp"></jsp:include>

<!-- 报表显示数据 -->

   <%
		List<Title> titles = (List<Title>)request.getSession().getAttribute("title");
	%>
  <table class="table">
    <th>
		<th style="font-family:'隶书';font-size: 22px">编号</th>
		<th style="font-family:'隶书';font-size: 22px">题目</th>
		<th style="font-family:'隶书';font-size: 22px">难度</th>
		<th style="font-family:'隶书';font-size: 22px">时间</th>
	</th>
	<%
		if(titles!=null){
			for(int i=0;i<titles.size();i++){
				%>
				<tr>
					<th></th>
					<th style="font-family:'隶书';font-size: 22px"><%=titles.get(i).getId() %></th>
					<th><a href="tomaintopic?id=<%=titles.get(i).getId()%>" style="color: #000;text-decoration: none;font-family:'隶书';font-size: 22px"><%=titles.get(i).getName() %></a></th>
					<th style="font-family:'隶书';font-size: 22px"><%=titles.get(i).getSort() %></th>
					<th style="font-family:'隶书';font-size: 22px"><%=titles.get(i).getTime() %></th>
				</tr>
				<% 
			}
		}else{
			%>
				<h2 style="font-family: '隶书'">当前暂无数据,尽请期待！</h2>
			<% 
		}
		
	%>
  </table>
</div>


</body>
</html>