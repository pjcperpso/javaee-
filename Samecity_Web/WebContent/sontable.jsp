<%@page import="com.bigera.db.Room"%>
<%@page import="com.bigera.dao.RoomDaoImpl"%>
<%@page import="com.bigera.dao.RoomDao"%>
<%@page import="com.bigera.db.TravleStartAdd"%>
<%@page import="com.bigera.dao.TravleSADaoImple"%>
<%@page import="com.bigera.dao.TravleSADao"%>
<%@page import="com.bigera.dao.TravleRoteDaoImpl"%>
<%@page import="com.bigera.dao.TravleRoteDao"%>
<%@page import="com.bigera.db.TravleRote"%>
<%@page import="com.bigera.db.Car"%>
<%@page import="com.bigera.dao.CarDaoImpl"%>
<%@page import="com.bigera.dao.CarDao"%>
<%@page import="com.bigera.db.TrainMS"%>
<%@page import="com.bigera.dao.TrainMSDaoImpl"%>
<%@page import="com.bigera.dao.TrainMSDao"%>
<%@page import="com.bigera.db.AirTicket"%>
<%@page import="java.util.List"%>
<%@page import="com.bigera.dao.AirTicketDaoImpl"%>
<%@page import="com.bigera.dao.AirTicketDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<style type="text/css">
#div_table{
	margin-top:20px;
	margin-left:10%;
	margin-right: 10%; 
}
</style>
</head>
<body>
<div class="panel panel-default" id="div_table">
<%
if(session.getAttribute("sontable")!=null){
	AirTicketDao airTicketDao = new AirTicketDaoImpl();
	String ap_id = (String)session.getAttribute("sontable");
	List<AirTicket> list = airTicketDao.selectair_t(ap_id);
	int num = 0;
	%>
	<div class="panel-heading" align="center">飞机票_AirTicket</div>
		<div class="panel-body">
			 <p style="margin-left: 20px">Welcome to <a href="/Samecity_Web/showtable?name=plane" style="color: #6EBFE9;font-size: 25px"><%=ap_id %></a> airport , This is air_ticket table , Please Mr or Miss enjoy sightseeing!</p>
		</div>
		<table class="table">
		<th>
			<th>席座</th>
			<th>票价</th>
			<th>余票</th>
		</th>
	<% 
	for(int i=0;i<list.size();i++){
		num++;
	%>
		<tr>
			<th>#<%=num%></th>
			<th><%=list.get(i).getName() %></th>
			<th><%=list.get(i).getPrice() %></th>
			<th><%=list.get(i).getSurplus() %></th>
		</tr>
	<% 
	}
	
}else if(session.getAttribute("trainsontable")!=null){
	TrainMSDao trainMSDao  = new TrainMSDaoImpl();
	String trname = (String)session.getAttribute("trainsontable");
	List<TrainMS> list_train = trainMSDao.selmidstation(trname);
	int num = 0;
	%>
	<div class="panel-heading" align="center">火车票_AirTicket</div>
		<div class="panel-body">
			 <p style="margin-left: 20px">Welcome to <a href="/Samecity_Web/showtable?name=train" style="color: #6EBFE9;font-size: 25px"><%=trname %></a> airport , This is air_ticket table , Please Mr or Miss enjoy sightseeing!</p>
		</div>
		<table class="table">
		<th>
			<th>经停站</th>
			<th>停靠时间</th>
		</th>
	<% 
	for(int i=0;i<list_train.size();i++){
		num++;
	%>
		<tr>
			<th>#<%=num%></th>
			<th><%=list_train.get(i).getName()%></th>
			<th><%=list_train.get(i).getStaytime() %>  min</th>
		</tr>
	<% 
	}
}else if(session.getAttribute("cc_id")!=null){
	CarDao carDao = new CarDaoImpl();
	String Ccid = (String)session.getAttribute("cc_id");
	List<Car> car = carDao.sel_byccid(Ccid);
	int num = 0;
	%>
	<div class="panel-heading" align="center">Car_Message车辆信息</div>
		<div class="panel-body">
			 <p style="margin-left: 20px">Welcome to <a href="/Samecity_Web/showtable?name=car" 
			 	style="color: #6EBFE9;font-size: 25px"><%=Ccid %></a> 
			 		car company , This is car message table , Please Mr or Miss enjoy sightseeing!</p>
		</div>
		<table class="table">
		<th>
			<th>车牌号</th>
			<th>车名</th>
			<th>租价/天</th>
		</th>
	<% 
	for(int i=0;i<car.size();i++){
		num++;
	%>
		<tr>
			<th>#<%=num%></th>
			<th><%=car.get(i).getId() %></th>
			<th><%=car.get(i).getName() %></th>
			<th><%=car.get(i).getPrice() %>￥</th>
		</tr>
	<% 
	}
}else if(session.getAttribute("tr_id")!=null){
	TravleSADao travleSADao = new TravleSADaoImple();
	String trid = (String)session.getAttribute("tr_id");
	List<TravleStartAdd> list = travleSADao.selall();
	int num = 0;
	%>
	<div class="panel-heading" align="center" style="font-size: 25px">Car_Message车辆信息</div>
		<div class="panel-body">
			 <p style="margin-left: 20px">Welcome to <a href="/Samecity_Web/showtable?name=travle" 
			 	style="color: #6EBFE9;font-size: 25px"><%=trid %></a> 
			 		Travle Rote , This is rote message table , Please Mr or Miss enjoy sightseeing!</p>
		</div>
		<table class="table">
		<th>
			<th>出发地</th>
			<th>价格</th>
		</th>
	<% 
	for(int i=0;i<list.size();i++){
		num++;
	%>
		<tr>
			<th>#<%=num%></th>
			<th><%=list.get(i).getCity()%></th>
			<th><%=list.get(i).getPrice()%></th>
		</tr>
	<% 
	}
}else if(session.getAttribute("h_id")!=null){
	RoomDao roomdao = new RoomDaoImpl();
	String hotelid = (String)session.getAttribute("h_id");
	List<Room> list_room = roomdao.selall(hotelid);
	%>
	<div class="panel-heading" align="center" style="font-size: 25px">Room_Message客房信息</div>
		<div class="panel-body">
			 <p style="margin-left: 20px">Welcome to <a href="/Samecity_Web/showtable?name=hotel" 
			 	style="color: #6EBFE9;font-size: 25px"><%=hotelid %></a> 
			 		hotel , This is room message table , Please Mr or Miss enjoy sightseeing!</p>
		</div>
		<table class="table">
		<tr>
			<th>客房号</th>
			<th>客房名</th>
			<th>客房价格</th>
			<th>独立卫浴</th>
		</tr>
	<% 
	for(int i=0;i<list_room.size();i++){
		%>
		<tr>
			<th><%=list_room.get(i).getId()%></th>
			<th><%=list_room.get(i).getName()%></th>
			<th><%=list_room.get(i).getPrice()%></th>
			<th><%=list_room.get(i).getIsbath()%></th>
		</tr>
		<% 
	}
}
%>
</table>
</div>

</body>
</html>