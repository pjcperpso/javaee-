package com.bigera.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigera.dao.UserDao;
import com.bigera.dao.UserDaoImpl;
import com.bigera.db.User;
@WebServlet(name="RegisterServlet",urlPatterns={"/registerservlet"})
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		PrintWriter writer = resp.getWriter();
		try {
			//User user = null;不合法
			User user = new User();
			UserDao userDao = new UserDaoImpl();
			String username = req.getParameter("username");
			String password = req.getParameter("passwd");
			int age = Integer.parseInt(req.getParameter("age"));
			String gender = req.getParameter("gender");
			String[] hobbys = req.getParameterValues("hobby");
			String hobby = hobbys[0];
			for(int i=1;i<hobbys.length;i++){
				hobby+=","+hobbys[i];
			}
			
			user.setName(username);
			user.setAge(age);
			user.setPasswd(password);
			user.setHobby(hobby);
			user.setGender(gender);
			System.out.println(user);
			if (userDao.selectuser(username)==null) {
				userDao.insertuser(user);	
				writer.println("注册成功!");
			}else {
				resp.sendRedirect("/Samecity_Web/register.html");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
