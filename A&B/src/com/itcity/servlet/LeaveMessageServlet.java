package com.itcity.servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itcity.bean.Message;
import com.itcity.bean.User;
import com.itcity.service.MessageService;
import com.itcity.service.impl.MessageServiceImpl;

@WebServlet("/leavemessageservlet")
public class LeaveMessageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		/*
		 * /firstname/secondname/tname/sortid/message
		 * */
		int sortid = Integer.parseInt(req.getParameter("sortid"));
		String tname = (String)session.getAttribute("tname");
		User user = (User)session.getAttribute("user");
		String firstname = null;
		if(user==null){
			firstname = "ÄäÃû";
		}else{
			firstname = user.getName();
		}
		//Calendar c = Calendar.getInstance();
		Date nowdate = new Date(new java.util.Date().getTime());
		String secondname = null;
		String pmessage = null;
		MessageService messageService = new MessageServiceImpl();
		Message message = null;
		if(sortid==1){
			pmessage = req.getParameter("leavemsg");
			secondname = tname;
			message = new Message(firstname, secondname, tname, sortid, pmessage, nowdate);
			System.out.println(message);
			try {
				messageService.addMessage(message);
			} catch (Exception e) {
				req.setAttribute("msg", e.getCause());
			}
		}else if(sortid==2){
			pmessage = req.getParameter("");
			secondname = "";
		}
		String url = "toleavemessage";
		req.getRequestDispatcher(url).forward(req, resp);
	}

}
