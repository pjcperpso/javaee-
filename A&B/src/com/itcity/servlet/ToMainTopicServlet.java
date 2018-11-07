package com.itcity.servlet;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itcity.bean.Title;
import com.itcity.service.TitleService;
import com.itcity.service.impl.TitleServiceImpl;
@WebServlet("/tomaintopic")
public class ToMainTopicServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		System.out.println(id+"---------");
		TitleService title = new TitleServiceImpl();
		try {
			Title selonetitle = title.selonetitle(Integer.parseInt(id));
			req.setAttribute("onetitle", selonetitle);
			String file = "D:/小浩项目文件/javaweb/javaee项目/A&B/src/"+id+".txt";
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String data = null;
			StringBuffer s = new StringBuffer();
			while((data=br.readLine())!=null){
				//s.append(data);
				s.append("</br>"+data);
			}
			System.out.println(s);
			br.close();
			isr.close();
			fis.close();
			req.setAttribute("data", s);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		String url = "/WEB-INF/jsp/maintopic.jsp";
		req.getRequestDispatcher(url).forward(req, resp);	
	}

}
