package com.itcity.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.net.ns.SessionAtts;

@WebServlet("/ToEnrollServlet")
public class ToEnrollServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String comname = req.getParameter("comname");
		if(comname==null){
			comname = (String)session.getAttribute("comname");
		}
		session.setAttribute("comname",comname);
		/*if (comname.equals("Ä§¹íÅÀÆÂ")) {
			
		}*/
		
		String url = "/WEB-INF/jsp/enroll.jsp";
		req.getRequestDispatcher(url).forward(req, resp);
	}
}
