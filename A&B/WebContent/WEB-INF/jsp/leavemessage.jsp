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
<jsp:include page="/WEB-INF/jsp/head.jsp"></jsp:include>
<body>
	<%
		List<Message> message = (List<Message>)request.getSession().getAttribute("message");
		User user = (User)request.getSession().getAttribute("user");
	%>
	<div style="margin-left: 10%;margin-right: 10%;margin-top: 2%;">
		<div class="row">
	  		<div class="col-lg-4">
				<a href="#" class="thumbnail" style="width: 300px;height: 380px">
	     		<img src="images/head.png" alt="...">
	   			</a>
	   		</div>
	   		
			<div class="col-lg-8">
			 <%
					if(message!=null){
						for(int i=0;i<message.size();i++){
							if(message.get(i).getSortid()==1){
								String pname = message.get(i).getFirstname();
					%>
				 <a href="#" class="thumbnail" style="text-decoration: none;">
				
				 <p style="margin-left: 5%;font-family: Georgia, serif;color: #000">
				 	<%=pname+":"+message.get(i).getMessage()+"/time:"+message.get(i).getNowdate() %>
				 </p>
				 	<%
				 	for(int j=0;j<message.size();j++){
					 	if(message.get(j).getSortid()==2&&message.get(j).getSecondname().equals(pname)){
					 	%>
					 		<p style="margin-left: 20%;font-family: Georgia, serif"><%=message.get(j).getFirstname()+":"+ message.get(j).getMessage()+"/time:"+message.get(j).getNowdate() %></p>
					 	<%
					 	}
				 	}if(user!=null&&(user.getName().equals(message.get(i).getTname()))){
				 	%>
				 	
				 <form action="leavemessageservlet?sortid=2&rname=<%=message.get(i).getFirstname() %>" method="post">
				 	<div class="input-group" style="margin-left: 8%;margin-top: 2%;">
  					<input type="text" name="replymessage" class="form-control" placeholder="Please Reply!" aria-label="..." >
					  <div class="input-group-btn">
					    <button class="btn btn-default" type="submit">回复</button>
					  </div>
					</div>
		    	 </form>		    	
				 <%
				 	
								}
				 	%>
				 	
    			 </a>
    				<% 
							}
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