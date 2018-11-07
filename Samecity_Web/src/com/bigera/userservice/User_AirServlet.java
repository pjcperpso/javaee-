package com.bigera.userservice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.bigera.db.AirPort;
import com.bigera.userdao.UAirDao;
import com.bigera.util.MBSqlSessionFactory;
@WebServlet("/userair")
public class User_AirServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		SqlSession sqlsession = MBSqlSessionFactory.getSqlSession(true);
		UAirDao mapper = sqlsession.getMapper(UAirDao.class);
		List<AirPort> minpriceport = mapper.selectport(1300.0);
		req.getSession().setAttribute("list", minpriceport);
		resp.sendRedirect("/Samecity_Web/UserAir.jsp");		
	}
}
