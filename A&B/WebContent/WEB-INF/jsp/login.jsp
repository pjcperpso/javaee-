<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<style type="text/css">
	#login{
		margin-top:200px;
		margin-left: 35%;
		margin-right: 35%;
	}
</style>
</head>
<body>
<div id="login">
<form  action="loginservlet" method="post" >
<div class="col-lg-12">
    <div class="input-group">
      <span class="input-group-btn">
      <button class="btn btn-default" type="button">用户名</button>
      </span>
      <input type="text" class="form-control" placeholder="Username..." name="name">
      
    </div><!-- /input-group -->
</div><!-- /.col-lg-6 -->

<div class="col-lg-12" style="margin-top: 30px">
    <div class="input-group">
      <span class="input-group-btn">
      <button class="btn btn-default" type="button" style="padding-left: 17px;padding-right: 17px" >密 码</button>
      </span>
      <input type="password" class="form-control" placeholder="Password..." name="passwd"> 
    </div><!-- /input-group -->
</div><!-- /.col-lg-6 -->

<input type="submit" value="登录" class="btn btn-success" style="width:320px;height:40px;margin-left:15px;">
<font style="margin-left: 30px;">自动登录</font>
<input style="margin-left: 10px;margin-top: 40px" type="checkbox" name="autoLogin" value="1">

</form>
</div>
</body>
</html>