package com.bigera.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/personal")
public class PersonalServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		PrintWriter writer = resp.getWriter();
		if(req.getSession().getAttribute("username")!=null){
			System.out.println(req.getSession().getAttribute("username"));
			resp.sendRedirect("/Samecity_Web/personal.jsp");
		}else{
			resp.sendRedirect("/Samecity_Web/Login.html");
		}
	}
}
