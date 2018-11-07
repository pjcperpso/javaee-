<%@page import="com.itcity.bean.Enroll"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>A&b_comfirmenroll</title>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<style type="text/css">
	.list-group-item{
		height: 60px;
		padding-top: 20px;
		font-family: Georgia, serif;
		font-size: 20px;
	}
	
	.badge{
		height: 22px;
	}
</style>
</head>
<%
	Enroll enroll = (Enroll)request.getSession().getAttribute("enroll");
%>
<body style="background-color: #F8F8F8">
	<div style="margin-left: 15%;margin-right: 15%;margin-top: 5%;">
		 <a href="#" class="thumbnail">
      		<img src="images/enroll.png" alt="...">
      		<!-- <h4 align="center">报名信息</h4> -->
   		 </a>
		
		<ul class="list-group">
   			<li class="list-group-item">
   			 姓  名:<%=enroll.getName()%>
  			</li>
  			<li class="list-group-item">
   			省份证号:<%=enroll.getShenfen() %>
  			</li>
  			<li class="list-group-item">
   			年  龄:<%=enroll.getAge() %>
  			</li>
  			<li class="list-group-item">
   			性  别:<%=enroll.getGender() %>
  			</li>
  			<li class="list-group-item">
    		<span class="badge"><a href="#" style="text-decoration: none;color: #fff">update</a></span>
   			参赛名称:<%=enroll.getC_name() %>
  			</li>
  			<li class="list-group-item">
    		<span class="badge"><a href="#" style="text-decoration: none;color: #fff">update</a></span>
   			毕业院校:<%=enroll.getSchool() %>
  			</li>
  			<li class="list-group-item">
    		<span class="badge"><a href="#" style="text-decoration: none;color: #fff">update</a></span>
   			电子邮箱:<%=enroll.getEmail() %>
  			</li>
  			<li class="list-group-item">
    		<span class="badge"><a href="#" style="text-decoration: none;color: #fff">update</a></span>
   			电话号码:<%=enroll.getPhone() %>
  			</li>
  			
  			
  		 <a href="ToEnrollServlet" class="thumbnail" style="text-decoration:none;margin-top: 20px;height: 80px;padding-top: 20px">
      		<p align="center" style="font-family: '隶书';font-size: 30px;color: #000">报名费:80/请点击支付</p>
   		 </a>
		</ul>
		
	</div>
</body>
</html>