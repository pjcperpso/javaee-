package com.itcity.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.itcity.bean.Title;
import com.itcity.dao.TitleDao;
import com.itcity.service.TitleService;
import com.itcity.util.MybatisSqlSessionFactory;

public class TitleServiceImpl implements TitleService{

	@Override
	public List<Title> selTitles(int id) throws Exception {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession(true);
		TitleDao mapper = sqlSession.getMapper(TitleDao.class);
		List<Title> alltitle = mapper.selAllTitle(id);
		if(alltitle!=null){
			return alltitle;
		}
		else{
			throw new Exception("当前没有数据");	
		}
		
	}

	@Override
	public Title selonetitle(int id) throws Exception {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession(true);
		TitleDao mapper = sqlSession.getMapper(TitleDao.class);
		Title selOneTitle = mapper.selOneTitle(id);
		if (selOneTitle!=null) {
			return selOneTitle;
		}
		else{
			throw new Exception("当前暂无数据");
		}
	}

}
