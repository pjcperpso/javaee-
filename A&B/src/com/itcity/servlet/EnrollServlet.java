package com.itcity.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itcity.bean.Enroll;
import com.itcity.bean.User;
import com.itcity.service.EnrollService;
import com.itcity.service.impl.EnrollServiceImpl;

@WebServlet("/enrollservlet")
public class EnrollServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		EnrollService enrollService = new EnrollServiceImpl();
		String c_name = (String) session.getAttribute("comname");
		User user = (User)req.getSession().getAttribute("user");
		String u_name = user.getName();
		System.out.println(c_name+"---"+u_name);
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String shenfen = req.getParameter("shenfen");
		String gender = req.getParameter("gender");
		String school = req.getParameter("school");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		Enroll enroll = new Enroll(null, c_name, u_name, name, shenfen, Integer.parseInt(age) , gender, school, email, phone);
		System.out.println(enroll);
		String url = null;
		try {
			session.setAttribute("enroll", enroll);
			url = "/WEB-INF/jsp/confirmenroll.jsp";
			enrollService.addEno(enroll);
		} catch (Exception e) {
			url = "ToEnrollServlet";
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher(url).forward(req, resp);
	}

}
