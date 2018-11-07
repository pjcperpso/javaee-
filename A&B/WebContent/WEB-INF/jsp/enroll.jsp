<%@page import="com.itcity.bean.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>A&b_enroll_firstpage</title>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<style type="text/css">
.input-group{
	margin-left: 30%;
	margin-right: 30%;
	margin-top: 15px;
}
</style>

</head>
<body style="background-color: #F8F8F8">
	<jsp:include page="/WEB-INF/jsp/head.jsp"></jsp:include>
	<div style="margin-left: 10%;margin-right: 10%;background-color: #fff">
			<h2 style="margin-top: 30px;padding-top: 20px" align="center">报名流程</h2>
			<h4 style="margin-top: 20px;margin-left: 5%;letter-spacing: 3px">第一步:如果还未注册的同学们请前往注册页面先注册,注册成功登陆后方可参加报名</h4>
			<h4 style="margin-top: 10px;margin-left: 5%;letter-spacing: 3px">第二步:登陆后,进入A&b编程大赛页面(本页面),填写相关信息,点击提交</h4>
			<h4 style="margin-top: 10px;margin-left: 5%;letter-spacing: 3px">第三步:查看相关信息后,确认并点击缴费,缴纳80参赛费</h4>
			<h4 style="margin-top: 10px;margin-left: 5%;letter-spacing: 3px;color:#FF1C1C ">报名成功后,会在五日内以短信的形式下发至您的手机,通知参赛地点等相关信息</h4>
			<div align="center" style="margin-top: 25px">
			<%
				User user = (User)request.getSession().getAttribute("user");
				if(user!=null){
			%>
				<h3>填写报名信息</h3>
				<h5 style="letter-spacing: 2px;color:#FF1C1C ">注意:姓名,身份证,年龄,性别填写后不可更改</h5>
				<form action="enrollservlet" method="post" >
						<div class="input-group">
					      <span class="input-group-btn">
					      <button class="btn btn-default" type="button" style="width: 300px;height: 60px;font-size: 30px;font-family: '隶书'"><%=request.getSession().getAttribute("comname") %></button>
					      </span>
					    </div><!-- /input-group -->
					    <div class="input-group">
					      <span class="input-group-btn">
					      <button class="btn btn-default" type="button" style="width: 100px">真实姓名</button>
					      </span>
					      <input type="text" class="form-control" placeholder="Name..." name="name"> 
					    </div><!-- /input-group -->
					    <div class="input-group">
					      <span class="input-group-btn">
					      <button class="btn btn-default" type="button" style="width: 100px">身 份 证</button>
					      </span>
					      <input type="text" class="form-control" placeholder="Shenfen..." name="shenfen"> 
					    </div><!-- /input-group -->
					    <div class="input-group">
					      <span class="input-group-btn">
					      <button class="btn btn-default" type="button" style="width: 100px">年  龄</button>
					      </span>
					      <input type="text" class="form-control" placeholder="Age..." name="age"> 
					    </div><!-- /input-group -->
					    <div class="input-group">
					      <span class="input-group-btn">
					      <button class="btn btn-default" type="button" style="width: 100px">性  别</button>
					      </span>
					      <input type="text" class="form-control" placeholder="Gender..." name="gender"> 
					    </div><!-- /input-group -->
					    <div class="input-group">
					      <span class="input-group-btn">
					      <button class="btn btn-default" type="button" style="width: 100px">学  校</button>
					      </span>
					      <input type="text" class="form-control" placeholder="School..." name="school"> 
					    </div><!-- /input-group -->
					    <div class="input-group">
					      <span class="input-group-btn">
					      <button class="btn btn-default" type="button" style="width: 100px">邮  箱</button>
					      </span>
					      <input type="text" class="form-control" placeholder="Email..." name="email"> 
					    </div><!-- /input-group -->
					    <div class="input-group">
					      <span class="input-group-btn">
					      <button class="btn btn-default" type="button" style="width: 100px">电  话</button>
					      </span>
					      <input type="text" class="form-control" placeholder="Phone..." name="phone"> 
					    </div><!-- /input-group -->
					    <div class="input-group">
					      <span class="input-group-btn">
					      <input class="btn btn-default" type="submit" style="width: 300px;height: 60px;font-size: 30px;font-family: '隶书';margin-top:20px;margin-bottom: 50px" value="保存信息"></button>
					      </span>
					    </div><!-- /input-group -->
					<!-- <input type="submit" value="保存信息" class="btn btn-success" style="width:320px;height:40px;margin-top: 20px;margin-bottom: 50px"> -->
				</form>
				<%
				}else{
					%>
						<h3 style="font-family: '隶书';padding-top:100px; padding-bottom: 100px;color:#FF1C1C;font-size: 30px">请先登录,若还未注册账号,请点击右上角注册账号先！</h3>
					<%
				}
				%>
			</div>
		</div>
</body>
</html>