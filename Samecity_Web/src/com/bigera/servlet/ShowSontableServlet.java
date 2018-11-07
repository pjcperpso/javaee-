package com.bigera.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/showsontable")
public class ShowSontableServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String sonname = req.getParameter("sonname");
		session.setAttribute("sontable", sonname);
		//System.out.println(session.getId()+sonname+"这是飞机");
		System.out.println(session+"----"+"zibiao");
		String trainname= req.getParameter("trainid");
		session.setAttribute("trainsontable", trainname);
		System.out.println(session.getId()+trainname+"这是火车");
		String ccid = req.getParameter("carcompanyid");
		session.setAttribute("cc_id", ccid);
		String trid = req.getParameter("tr_id");
		session.setAttribute("tr_id", trid);
		String hotelid = req.getParameter("hid");
		session.setAttribute("h_id", hotelid);
		System.out.println(hotelid);
		resp.sendRedirect("/Samecity_Web/sontable.jsp");
	}

}
