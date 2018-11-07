package com.bigera.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="AdminServlet",urlPatterns={"/adminlogin"})
public class AdminServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		HttpSession session = req.getSession();
		String name = req.getParameter("adminname");
		String passwd = req.getParameter("adminpsw");
		PrintWriter writer = resp.getWriter();
		if (name!=null&&passwd!=null) {
			if (name.equals("admin")&&passwd.equals("admin")) {
				Cookie cookie = 
						new Cookie("user", name+"="+passwd);
				cookie.setPath("/");
				//设置cookie时间为一小时
				cookie.setMaxAge(60*60);
				resp.addCookie(cookie);
				session.setAttribute("admin", name);
				System.out.println(session);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}else{
				resp.sendRedirect("/Samecity_Web/admin_login.html");
			}	
		}else {
			//resp.sendRedirect("");
			writer.println("请先登录");
		}
		
	}

}
