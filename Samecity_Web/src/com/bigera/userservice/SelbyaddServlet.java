package com.bigera.userservice;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import com.bigera.db.AirPort;
import com.bigera.userdao.UAirDao;
import com.bigera.util.MBSqlSessionFactory;
@WebServlet("/seladd")
public class SelbyaddServlet extends HttpServlet{
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
		
		String staname = req.getParameter("userselstartadd");
		System.out.println(staname);
		String stopname = req.getParameter("userselstopadd");
		System.out.println(stopname);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startadd", staname);
		map.put("stopadd", stopname);

		List<AirPort> allrotes = mapper.selectAirbystartorstop(map);
		HttpSession session = req.getSession();
		session.setAttribute("all_rotes", allrotes);
		resp.sendRedirect("/Samecity_Web/UserAir.jsp");
	}
}
