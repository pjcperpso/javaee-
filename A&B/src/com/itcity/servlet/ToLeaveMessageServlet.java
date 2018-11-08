package com.itcity.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itcity.bean.Message;
import com.itcity.service.MessageService;
import com.itcity.service.impl.MessageServiceImpl;

@WebServlet("/toleavemessage")
public class ToLeaveMessageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session = req.getSession();
		String tname = req.getParameter("tname");
		session.setAttribute("tname", tname);
		List<Message> selmessages = null;
		//System.out.println(tname);
		//ÆÀÂÛ
		//int sortid = 1;
		/*HashMap<String, Object> map= new HashMap<String,Object>();
		map.put("tname",tname);
		map.put("sortid", sortid);*/
		MessageService messageService = new MessageServiceImpl();
		try {
			selmessages = messageService.selmessages(tname);
			session.setAttribute("message", selmessages);
		} catch (Exception e) {
			System.out.println("fsdfsfsfsfs------------");
			req.setAttribute("msg", e.getCause());
		}
		String url = "/WEB-INF/jsp/leavemessage.jsp";
		req.getRequestDispatcher(url).forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
