<%@page import="com.itcity.bean.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head> -->

<nav class="navbar navbar-default">
  <div class="container-fluid" align="center">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header" style="margin-left: 30px">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <img alt="" src="images/title.png">
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="margin-top: 15px;margin-bottom:15px ">
      <ul class="nav navbar-nav">
        <li><a href="#" style="font-size: 28px;font-family: '隶书';margin-top: 10px;margin-left: 5px">A&b计算机能力考试</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right" style="margin-top: 12px">
     	<li><a href="/A&B/index.jsp" style="font-size: 20px;font-weight: bold">首页</a></li>
        <li><a href="toBriefintrodServlet" style="font-size: 16px;font-weight: bold;margin-right: 20px;">A&b简介</a></li>
        <li><a href="toCompeteServlet" style="font-size: 16px;font-weight: bold;margin-right: 20px">A&b编程大赛</a></li>
        <li><a href="totitleservlet" style="font-size: 16px;margin-right: 20px;font-weight: bold;">A&b编程打卡</a></li>
        <li><a href="toRegisterServlet" style="font-size: 20px;color: #1698DB;font-family: Georgia, serif;font-weight: bold;">注册</a></li>
        <li><a href="toLoginServlet" style="font-size: 20px;font-weight: bold;margin-right: 20px;color: #1698DB;font-family: Georgia, serif;">
        	<%
        		String name = null;
        		if(request.getSession().getAttribute("user")==null){
        			name = "登录";
        		}else{
        			User user = (User)request.getSession().getAttribute("user");
        			name = user.getName();
        		}
        	%>
        	<%=name %></a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</div>

