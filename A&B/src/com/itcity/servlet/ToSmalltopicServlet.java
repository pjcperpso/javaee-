package com.itcity.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itcity.bean.Title;
import com.itcity.service.TitleService;
import com.itcity.service.impl.TitleServiceImpl;
@WebServlet("/tosmalltopicservlet")
public class ToSmalltopicServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TitleService titles = new TitleServiceImpl();
		
		String id = req.getParameter("sort");
		HttpSession session = req.getSession();
		try {
			List<Title> title = titles.selTitles(Integer.parseInt(id));
			System.out.println(title);
			session.setAttribute("title", title);
		} catch (Exception e) {
			req.setAttribute("msg", e.getCause());
		}
		String url = "/WEB-INF/jsp/smalltopic.jsp";
		req.getRequestDispatcher(url).forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
