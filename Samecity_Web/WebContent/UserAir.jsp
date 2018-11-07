<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.bigera.userdao.UAirDao"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="com.bigera.util.MBSqlSessionFactory"%>
<%@page import="com.bigera.db.AirPort"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	#show_table{
		margin-left: 60px;
		margin-right: 60px;
		margin-top: 15px;
	}
</style>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">
        <img style="margin-left: 50px" alt="Brand" src="image/userairplane.png"><font style="margin-left:15px;font-size:22px;font-family:'隶书'">航班预定</font>
      </a>
      <form class="navbar-form navbar-left" role="search" style="margin-left:400px">
  		<div class="form-group">
    	<input type="text" class="form-control" placeholder="Search" style="width: 300px">
  		</div>
  		<button type="submit" class="btn btn-default">Submit</button>
	  </form>
    </div>
  </div>
</nav>

<!--  -->
<div class="jumbotron" style="height: 300px;">
<div class="col-sm-12 col-md-5">
  <h2>把世界装进口袋，在这全世界就是你的! ! !</h2>
  <p style="font-family: '幼圆';">开学季，订单多多，优惠多多！来乡友会订票，给您满意的价格！</p>
</div>

<div class="col-sm-12 col-md-5" style="margin-left: 200px">
  <h2>请输入飞行区间</h2>
  <form action="/Samecity_Web/seladd" method="post" >
  <p><input type="text" class="form-control" placeholder="Start Add..." style="width: 300px;height: 42px" name="userselstartadd">
  <input type="text" class="form-control" placeholder="Stop Add..." style="width:300px;margin-top: 15px;height: 42px" name="userselstopadd"></p>
  <p><button type="submit" class="btn btn-success btn-lg">Spend Price~</button></p>
  </form>
</div>
</div>

<!-- 低价区 -->
<ul class="nav nav-tabs">
  <li role="presentation" class="active"><a href="#">低价区</a></li>
</ul>
<div class="row" style="margin-top: 10px">
<%
	List<AirPort> minpriceairport = (List<AirPort>)request.getSession().getAttribute("list");
	if(minpriceairport!=null){
	for(int i=0;i<minpriceairport.size();i++){
		%>
	<div class="row">
  		<div style="margin-left: 30px;" class="col-sm-12 col-md-3">
    		<div class="thumbnail" style="background-color:#EEEEEE">
      			<img style="margin-top: 20px" src="image/airplane.png" alt="...">
      			<div class="caption">
        		<h3 align="center"><%=minpriceairport.get(i).getAp_id() %></h3>
        		<p align="center">起飞地:<%=minpriceairport.get(i).getStartadd() %>
        		<font style="margin-left: 20px">目的地:</font><%=minpriceairport.get(i).getStopadd() %>
        		</p>
        		<p align="center"><a style="width: 150px;height: 40px" href="#" class="btn btn-success btn-lg" role="button">center</a>
      			</p></div>
    		</div>
  		</div>
	</div>
		<% 
	}
	}

%>
</div>


<!-- 搜索结果 -->
<%
	List<AirPort> list = (List<AirPort>)request.getSession().getAttribute("all_rotes");
    if(list!=null){
	if(list.size()!=0){
		%>
		<ul class="nav nav-tabs" style="margin-top: 10px" id="message">
		<li role="presentation" class="active"><a href="#">航班信息</a></li>
		<li role="presentation"><a href="#">Result <span class="badge"><%=list.size() %></span></a></li>
		</ul>
		<div class="panel panel-success" id="show_table">
		<div class="panel-heading" align="center">航班查询结果</div>
  			<table class="table" >
				<th>
					<th>航班号</th>
					<th>餐饮？</th>
					<th>起飞地</th>
					<th>目的地</th>
					<th>起飞时间</th>
					<th>预计到达</th>
				</th>
				<%
					int num = 0;
					for(AirPort airPort:list){
						num++;
						%>
							<tr>
								<th><%=num %></th>
								<th><%=airPort.getAp_id()%></th>
								<th><%=airPort.getOrfoods()%></th>
								<th><%=airPort.getStartadd()%></th>
								<th><%=airPort.getStopadd()%></th>
								<th><%=airPort.getStarttime()%></th>
								<th><%=airPort.getStoptime()%></th>
								<th><a style="color: #29BE96;font-family: '隶书';font-size: 18px" href="#">预定</a></th>
							</tr>
						<%
					}
				%>
				
  			</table>
  			</div>
		<% 		
	}
	else{
		%>
		<h3 style="margin-left: 50%;margin-top: 30px;color: #808080;">暂无结果</h3>
		<% 
	}
    }
%>

</body>
</html>