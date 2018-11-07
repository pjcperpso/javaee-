<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Main_A&b</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/head.jsp"></jsp:include>
<div class="jumbotron" style="height:600px;background:">
  <p><font style="color: #303030;font-size: 52px;margin-left: 100px;font-family: Georgia, serif;">为什么<span>
  	 <font style="color: #303030;font-size: 32px;margin-left: 5px;font-family: Georgia, serif;">坚持</font></span></p>
  <p><font style="color: #303030;font-size: 32px;margin-left: 150px;font-family: Georgia, serif;">想一想<span>
  	 <font style="color: #303030;font-size: 52px;font-family: Georgia, serif;">当初</font></span></p>
  <p><img alt="" src="images/timeone.png" style="margin-left: 350px">
  <img alt="" src="images/timetwo.png" style="margin-left:20px">
  <img alt="" src="images/timethree.png" style="margin-left:20px">
  <img alt="" src="images/timefour.png" style="margin-left:20px">
  </p>
<div class="row" align="center" style="margin-left: 200px;margin-right: 200px;margin-top: 80px">
  <div class="col-xs-12 col-md-4">
    <img alt="" src="images/book.png"><a href="todiplomadservlet" style="font-size: 25px;font-weight: bold;color: #000;margin-left: 5px;text-decoration: none;">证书真伪</a>
  </div>
  <div class="col-xs-12 col-md-4">
    <img alt="" src="images/test.png"><a href="totitleservlet" style="font-size: 25px;font-weight: bold;color: #000;margin-left: 5px;text-decoration: none;">真题练习</a>
  </div>
  <div class="col-xs-12 col-md-4">
  	<img alt="" src="images/message.png" align="center"><a href="#" style="font-size: 25px;font-weight: bold;color: #000;margin-left: 5px;text-decoration: none;">考试信息</a>
  </div>
</div>
</div>

<jsp:include page="/WEB-INF/jsp/end.jsp"></jsp:include>
</body>
</html>