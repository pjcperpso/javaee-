<%@page import="java.util.List"%>
<%@page import="com.itcity.bean.Message"%>
<%@page import="com.itcity.bean.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>A&b_leacemessage</title>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</head>
<body>
	<%
		List<Message> pmessage = (List<Message>)request.getSession().getAttribute("pmessage");
	%>
	<div style="margin-left: 10%;margin-right: 10%;margin-top: 2%;">
		<div class="row">
	  		<div class="col-lg-4">
				<a href="#" class="thumbnail" style="width: 300px;height: 350px">
	     		<img src="images/teacher2.png" alt="...">
	   			</a>
	   		</div>
	   		
			<div class="col-lg-8">
			<%
				if(pmessage!=null){
					for(int i=0;i<pmessage.size();i++){
			%>
				 <a href="#" class="thumbnail" style="text-decoration: none;">
				 <font style="margin-left: 5%;font-family: Georgia, serif;color: #000">
				 	<%=pmessage.get(i).getFirstname()+":"+pmessage.get(i).getMessage()+"/time:"+pmessage.get(i).getNowdate() %>
				 </font>
				 <form action="leavemessageservlet?sortid=2" method="post">
				 	<div class="input-group" style="margin-left: 8%;margin-top: 2%;">
  					<input type="text" class="form-control" placeholder="Please Reply!" aria-label="..." >
					  <div class="input-group-btn">
					    <button class="btn btn-default" type="submit">回复</button>
					  </div>
					</div>
		    	 </form>
    			 </a>
    		<%
					}
				}
    		%>
			</div>
		</div>
		<form action="leavemessageservlet?sortid=1" method="post">
		<div class="input-group input-group-lg" style="margin-top: 10%;">
	  		<input type="text" name="leavemsg" class="form-control" placeholder="Please leave a message!" aria-describedby="sizing-addon1">
			<span class="input-group-btn">
		        <button class="btn btn-default" type="submit">评论</button>
		    </span>
		</div>
		</form>
	</div>
	

</body>
</html>