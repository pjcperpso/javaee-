package com.itcity.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itcity.bean.User;
import com.itcity.dao.UserDao;
import com.itcity.service.UserService;
import com.itcity.service.impl.UserServiceImpl;
@WebServlet("/registerservlet")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String psw = req.getParameter("passwd");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		UserService userService= new UserServiceImpl();
		User user = new User(name,psw,age,gender);
		System.out.println(user);
		String url = null;
		try {
			url = "/WEB-INF/jsp/login.jsp";
			userService.register(user);
		} catch (Exception e) {
			url = "toRegisterServlet";
		}
		req.getRequestDispatcher(url).forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
