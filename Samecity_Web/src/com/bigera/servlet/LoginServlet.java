package com.bigera.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bigera.dao.UserDao;
import com.bigera.dao.UserDaoImpl;
import com.bigera.db.User;
@WebServlet(name="LoginServlet",urlPatterns={"/loginservlet"})
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		try {
			HttpSession session = req.getSession();
			UserDao userdao = new UserDaoImpl();
			String name = req.getParameter("username");
			String password = req.getParameter("passwd");
			System.out.println(name+"===="+password);
			//自动登录
			String autoLogin = req.getParameter("autoLogin");
			PrintWriter writer = resp.getWriter();
			User user = userdao.selectuser(name);
			if (user!=null) {
				if (name.equals(user.getName())&&password.equals(user.getPasswd())) {
					if ("1".equals(autoLogin)) {
						Cookie cookie = 
								new Cookie("user", name+"="+password);
						cookie.setPath("/");
						cookie.setMaxAge(60*60);
						resp.addCookie(cookie);
					}
					session.setAttribute("username", name);
					resp.sendRedirect("/Samecity_Web/index.html");
					return;	
				}else {
					resp.sendRedirect("/Samecity_Web/Login.html");
				}
			}else {
				writer.println("用户为空");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
