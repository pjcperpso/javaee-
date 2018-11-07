<%@page import="com.bigera.dao.HotelDaoImpl"%>
<%@page import="com.bigera.dao.HotelDao"%>
<%@page import="com.bigera.db.Hotel"%>
<%@page import="com.bigera.db.TravleRote"%>
<%@page import="com.bigera.dao.TravleRoteDaoImpl"%>
<%@page import="com.bigera.dao.TravleRoteDao"%>
<%@page import="com.bigera.dao.CarCompanyDao"%>
<%@page import="com.bigera.dao.CarCompanyDaoImpl"%>
<%@page import="com.bigera.db.CarCompany"%>
<%@page import="com.bigera.dao.AirPortDao"%>
<%@page import="com.bigera.dao.TrainRoteDaoImpl"%>
<%@page import="com.bigera.dao.TrainRoteDao"%>
<%@page import="com.bigera.db.TrainRote"%>
<%@page import="com.bigera.dao.AirPortDaoImpl"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bigera.db.AirPort"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
#div_bar{
	margin-top: 20px;
	margin-left:35%;
	margin-right: 30%;
}
#div_car{
	margin-top: 20px;
	margin-left: 30%;
	margin-right: 30%;
	margin-bottom: 20px;
}
#show_table{
	margin-left: 15%;
	margin-right: 15%;
	margin-top: 15px;
}
/* ul li ul{position: absolute; display: none;}
ul li:hover ul{display: block;} */
</style>

</head>
<body>
<%-- <span class="input-group-addon" id="basic-addon1"><%=request.getSession().getAttribute("admin")%></span>
	<span class="input-group-addon" id="basic-addon1"><a>Break!</a></span> --%>
<div id="div_bar" class="input-group">
 	<input type="text" class="form-control" placeholder="Search for...">
      <span class="input-group-btn">
        <button class="btn btn-default" type="button">Go!</button>
      </span>
</div>
<ul class="nav nav-tabs nav-justified" style="margin-top: 20px;padding-right:0">
  <li role="presentation" ><a href="/Samecity_Web/showtable?name=plane">Plane</a></li>
  <li role="presentation"><!-- <img src="image/travle_admin.png" style="margin-top: 15px;"> -->
  <a href="/Samecity_Web/showtable?name=train">Train</a></li>
  <li role="presentation"><a href="/Samecity_Web/showtable?name=car">Car</a></li>
  <li role="presentation"><a href="/Samecity_Web/showtable?name=travle">Travle</a></li>
  <li role="presentation"><a href="/Samecity_Web/showtable?name=hotel">Hotel</a>
<!--   		<ul class="nav nav-tabs nav-justified">
  			<li role="presentation"><a href="/Samecity_Web/showthotel?name=train_dept">hotel</a></li>
  			<li role="presentation"><a href="/Samecity_Web/showthotel?name=train_ticket">room</a></li>
  		</ul> -->
  </li>
</ul>
  <div class="panel panel-default" id="show_table">
  <%
  if(session.getAttribute("last_name")!=null){
  	if(session.getAttribute("last_name").equals("plane")){
  		//飞机
  		AirPortDao airPortDao = new AirPortDaoImpl();
  		List<AirPort> list = airPortDao.selectair();
  		
  		%>
  		<div class="panel-heading">Airplane Table</div>
  		<table class="table">
  		 <th>
                        <th>名字</th>
                        <th>起飞地</th>
                        <th>目的地</th>
                        <th style="color: #6EBFE9">所属航班</th>
                      </th>
  		<% 
  		
		for(int i=0;i<list.size();i++){
			%>
				<tr>
					<th>#</th>
		            <th><%=list.get(i).getAp_id() %></th>
					<th><%=list.get(i).getStartadd()%></th>
					<th><%=list.get(i).getStopadd() %></th>
					<th style="color: #6EBFE9;"><img src="image/air.png"/><%=list.get(i).getAc_id() %></th>
					<th style="color: #6EBFE9;"><img src="image/set.png"/><a href="/Samecity_Web/showsontable?sonname=<%=list.get(i).getAp_id() %>">席位</a></th>
				</tr>
			<%
		
		}	
  	}else if(session.getAttribute("last_name").equals("train")){
  		//火车
  		TrainRoteDao trainRoteDao = new TrainRoteDaoImpl();
  		List<TrainRote> list = trainRoteDao.seltrainrote();
  		%>
  				<div class="panel-heading" align="center">Train Table</div>
  				<table class="table">
  		 			<th>
                        <th>线路</th>
                        <th>始发地</th>
                        <th>终点站</th>
                      </th>
  		<%
  		for(int i=0;i<list.size();i++){
			%>
				<tr>
					<th>#</th>
					<th><%=list.get(i).getName() %></th>
					<th><%=list.get(i).getStartadd() %></th>
					<th><%=list.get(i).getStopadd() %></th>
				    <th><a href="/Samecity_Web/showsontable?trainid=<%=list.get(i).getName() %>">经停信息</a></th>
				</tr>
			<%
		
		}	
  	}else if(session.getAttribute("last_name").equals("car")||session.getAttribute("last_name").equals("searchcity")){
  		%>
  		<form action="/Samecity_Web/showtable?name=searchcity" method="post">
  		<div id="div_car" class="input-group">
 			<input type="text" class="form-control" placeholder="Search for city..." name="carcity">
      		<span class="input-group-btn">
        	<button class="btn btn-default" type="submit">Search!</button>
      		</span>
		</div>
		</form>
  		<%
  		List<CarCompany> list_Car = null;
 		CarCompanyDao carCompanyDao = new CarCompanyDaoImpl();
 		if(session.getAttribute("last_name").equals("car")){
  			list_Car = carCompanyDao.selall();
 		}else if(session.getAttribute("last_name").equals("searchcity")){
 			list_Car = carCompanyDao.sel_bycity((String)session.getAttribute("carcity"));
 		}
  		int num = 0;
  		%>
  		<div class="panel-heading" align="center">Car Table</div>
  				<table class="table">
  		 			<th>
                        <th>车行编号</th>
                        <th>车行名</th>
                        <th>所在城市</th>
                      </th>
  		<% 
  		for(int i=0;i<list_Car.size();i++){
  			num++;
  		%>
  			<tr>
  				<th>#<%=num %></th>
  				<th><%=list_Car.get(i).getId() %></th>
  				<th><%=list_Car.get(i).getName() %></th>
  				<th><%=list_Car.get(i).getCity() %></th>
  				<th><a href="/Samecity_Web/showsontable?carcompanyid=<%=list_Car.get(i).getId()%>">车辆信息</a></th>
  				<th></th>
  			</tr>
  		<% 
  		}
  		
  	}else if(session.getAttribute("last_name").equals("travle")){
  		TravleRoteDao travleRoteDao = new TravleRoteDaoImpl();
  		List<TravleRote> list_travlerote = travleRoteDao.selallrote();
  		%>
			<div class="panel-heading" align="center">Train Table</div>
			<table class="table">
	 			<th>
                <th>线路编号</th>
                <th>线路名</th>
                <th>线路选择</th>
                <th>线路A</th>
                <th>线路B</th>
                <th>线路C</th>
              </th>
		<%
		int num=0;
		for(int i=0;i<list_travlerote.size();i++){
			num++;
			%>
			<tr>
				<th>#<%=num %></th>
				<th><%=list_travlerote.get(i).getId() %></th>
				<th style="color: #6EBFE9">
				<a href="/Samecity_Web/showsontable?tr_id=<%=list_travlerote.get(i).getId()%>">
				<%=list_travlerote.get(i).getName() %>
				</a>
				</th>
				<th><%=list_travlerote.get(i).getNum() %></th>
				<th>
				<% 
				if(list_travlerote.get(i).getSorta()==null){
					%>
					<%
				}else{
					%>
					<%=list_travlerote.get(i).getSorta()%>
					<%
				}
				%>
				</th>
				<th><%=list_travlerote.get(i).getSortb()%></th>
				<th>
				<% 
				if(list_travlerote.get(i).getSortc()==null){
				%>
				<%
				}else{
					%>
					<%=list_travlerote.get(i).getSortc() %>
					<% 
				}
				%>
				</th>
			</tr>	
			<%
		}
  	}else if(session.getAttribute("last_name").equals("hotel")||session.getAttribute("last_name").equals("searchmessage")){
  		%>
  		<form action="/Samecity_Web/showtable?name=searchmessage" method="post">
  		<div id="div_car" class="input-group">
 			<input type="text" class="form-control" placeholder="Search for message..." name="message">
      		<span class="input-group-btn">
        	<button class="btn btn-default" type="submit">Search!</button>
      		</span>
		</div>
		</form>
  		<%
  		List<Hotel> list_hotel = null;
 		HotelDao hotelDao = new HotelDaoImpl();
  		if(session.getAttribute("last_name").equals("hotel")){
  			list_hotel = hotelDao.selall();
  		}else if(session.getAttribute("last_name").equals("searchmessage")){
 			String msg = (String)session.getAttribute("hmsg");
  			list_hotel = hotelDao.selbycity(msg);
  			System.out.println(list_hotel.size());
  		}
  		int num = 0;
  		%>
  		<div class="panel-heading" align="center">Hotel Table</div>
  				<table class="table">
  		 			<th>
                        <th>酒店id</th>
                        <th>酒店名称</th>
                        <th>房间总数</th>
                        <th>所在城市</th>
                      </th>
  		<% 
  		for(int i=0;i<list_hotel.size();i++){
  			num++;
  		%>
  			<tr>
  				<th>#<%=num %></th>
  				<th><%=list_hotel.get(i).getId() %></th>
  				<th style="color: #6EBFE9"><a href="/Samecity_Web/showsontable?hid=<%=list_hotel.get(i).getId() %>"><%=list_hotel.get(i).getName() %></a></th>
  				<th><%=list_hotel.get(i).getRoomsum() %></th>
  				<th><%=list_hotel.get(i).getCity() %></th>
  				<th></th>
  			</tr>
  		<% 
  		}
  	}
  }
	%>
	
  </table>
</div>

</body>
</html>