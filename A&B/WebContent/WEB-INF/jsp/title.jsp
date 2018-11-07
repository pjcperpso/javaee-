<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>P&b_Title</title>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/head.jsp"></jsp:include>
<div class="row" style="margin-left: 30%">
  <div class="col-xs-6 col-md-3" align="center">
    <a href="tosmalltopicservlet?sort=6" class="thumbnail" style="text-decoration: none;">
      <img src="images/good.png" alt="..."></br>
      <img src="images/smalllevel.png" alt="...">
      <h3 style="color: #000;margin-top: 60px">难度系数低</h3>
      <p><font style="color: #000">初次涉猎编程的童鞋请点这里</font></p>
      <font style="color: #000">平均难度系数6颗星</font>
    </a>
  </div>
  <div class="col-xs-6 col-md-3" align="center">
    <a href="tosmalltopicservlet?sort=8" class="thumbnail" style="text-decoration: none;">
      <img src="images/good.png" alt="..."></br>
      <img src="images/biglevel.png" alt="...">
      <h3 style="color: #000;margin-top: 60px">难度系数较高</h3>
      <p><font style="color: #000">精通数据结构的童鞋请点这里</font></p>
      <font style="color: #000">平均难度系数8颗星</font>
    </a>
  </div>
</div>
<jsp:include page="/WEB-INF/jsp/end.jsp"></jsp:include>
</body>
</html>