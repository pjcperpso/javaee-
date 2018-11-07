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
</head>
<body>
<jsp:include page="/WEB-INF/jsp/head.jsp"></jsp:include>
<div class="jumbotron" align="center">
  <h3>考试信息</h3>
  <p style="margin-left: 300px;margin-right: 300px">A&b最近一次考试将于2019.02.26举行,考试地点分别设立在上海、北京、广州、深圳、武</p>
  <p>汉、厦门、杭州、南京、苏州、西安、重庆、成都、呼和浩特等地，请报名参加比赛的学生自带电脑,并准备纸和笔</p>
  <p>各个赛程同一时间举行,每个人限报一项</p>
  <p>报名截止时间:2018.12.30</p>
  <p style="margin-top: 15px"><a href="/A&B/index.jsp" style="color: #000;">A&b联盟公告</a><font style="margin-left: 20px;margin-right: 20px">|</font><a style="color: #000">A&b@millions.cn</a></p>
</div>

<div class="row" style="margin-left: 100px;margin-right: 100px">
  <div class="col-sm-6 col-md-3">
    <div class="thumbnail">
      <img src="images/tianti.png" alt="...">
      <div class="caption">
        <h3>天梯赛</h3>
        <p>难度层层递进,初级-中级-高级,可用语言:java、c、c++、python、ruby</p>
        <a href="ToEnrollServlet?comname=天梯赛" class="btn btn-primary" role="button">点击报名</a>
      </div>
    </div>
  </div>
  
  <div class="col-sm-6 col-md-3">
    <div class="thumbnail">
      <img src="images/personal.png" alt="...">
      <div class="caption">
        <h3>C语言挑战营</h3>
        <p>针对于数据结构和算法,掌握基本的c语言与法都可参赛,语言:仅限于C语言</p>
        <a href="ToEnrollServlet?comname=c语言挑战营" class="btn btn-primary" role="button">点击报名</a>
      </div>
    </div>
  </div>
  
  <div class="col-sm-6 col-md-3">
    <div class="thumbnail">
      <img src="images/team.png" alt="...">
      <div class="caption">
        <h3>精英团体杯</h3>
        <p>团队参赛,单支团队参赛人数6-10人不等,冠军团队可参加A&b暑期训练营</p>
       <a href="ToEnrollServlet?comname=精英团体杯" class="btn btn-primary" role="button">点击报名</a>
      </div>
    </div>
  </div>
  
  <div class="col-sm-6 col-md-3">
    <div class="thumbnail">
      <img src="images/mogui.png" alt="...">
      <div class="caption">
        <h3>魔鬼爬坡</h3>
        <p>分组式淘汰赛,根据参赛人数进行分组,组内淘汰,最后选出单组冠军进行决赛</p>
        <a href="ToEnrollServlet?comname=魔鬼爬坡" class="btn btn-primary" role="button">点击报名</a>
      </div>
    </div>
  </div>
</div>
<jsp:include page="/WEB-INF/jsp/end.jsp"></jsp:include>
</body>
</html>