package com.bigera.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bigera.dao.AirPortDao;
import com.bigera.dao.AirPortDaoImpl;
import com.bigera.dao.AirTicketDao;
import com.bigera.db.AirPort;
import com.bigera.db.AirTicket;

@WebServlet(name="ShowtableServlet",urlPatterns={"/showtable"})
public class ShowtableServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		//飞机：航线表
		/*AirPortDao airPortDao = new AirPortDaoImpl();
		List<AirPort> list_port = airPortDao.selectair();*/
		//火车：铁路局表
		
		//车行表
		
		//旅游表
		
		//宾馆表
		
		String name = req.getParameter("name");
		HttpSession session = req.getSession();
		session.setAttribute("last_name", name);
		System.out.println(session+"fubiao");
		//System.out.println(city);
		String city = req.getParameter("carcity");
		if(city!=null){
			session.setAttribute("carcity", city);
			System.out.println(city);
		}
		String message = req.getParameter("message");
		if(message!=null){
			session.setAttribute("hmsg", message);
			System.out.println(message);
		}
		resp.sendRedirect("/Samecity_Web/admin.jsp");
	}

}
