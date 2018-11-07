package com.itcity.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itcity.bean.User;
import com.itcity.service.UserService;
import com.itcity.service.impl.UserServiceImpl;
/*
 * 登录成功用session保存用户信息
 * 登录失败抛出异常
 * */
@WebServlet("/loginservlet")
public class loginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String passwd = req.getParameter("passwd");
		UserService userService = new UserServiceImpl();
		HttpSession session = req.getSession();
		String url = null;
		try {
			User user = userService.login(name, passwd);
			url = "/index.jsp";
			System.out.println(user.getName()+"登录");
			session.setAttribute("user", user);	
		} catch (Exception e) {
			url = "toLoginServlet";
			req.setAttribute("msg", e.getCause());
		}
		req.getRequestDispatcher(url).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
