package com.bigera.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/amdinindex")
public class AdminIndex extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		for(Cookie cookie:cookies){
			String name = cookie.getName();
			String[] split = name.split("=");
			if (split[0].equals("admin")&&split[1].equals("admin")) {
				resp.sendRedirect("/Samecity_Web/index.html");
				System.out.println(name);
			}
			
		}
		resp.sendRedirect("/Samecity_Web/Login.html");
	}
}
