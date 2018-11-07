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
<form action="registerservlet" method="post" >
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

<div class="col-lg-12" style="margin-top: 30px">
    <div class="input-group">
      <span class="input-group-btn">
      <button class="btn btn-default" type="button" style="padding-left: 17px;padding-right: 17px" >年 龄</button>
      </span>
      <input type="text" class="form-control" placeholder="age..." name="age"> 
    </div><!-- /input-group -->
</div><!-- /.col-lg-6 -->
<div class="col-lg-12" style="margin-top: 30px">
    <div class="input-group">
      <span class="input-group-btn">
      <button class="btn btn-default" type="button" style="padding-left: 17px;padding-right: 17px" >性 别</button>
      </span>
		<input style="margin-left: 20px;margin-top: 10px" type="radio" name="gender" value="男">男
		<input style="margin-left: 100px" type="radio" name="gender" value="女">女
	</div>
</div>
<input type="submit" value="注册" class="btn btn-primary" style="width:420px;height:40px;margin-left:20px;margin-top: 30px">
</form>
</div>
</body>
</html>