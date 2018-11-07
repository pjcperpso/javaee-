package com.itcity.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.itcity.bean.Enroll;
import com.itcity.dao.EnrollDao;
import com.itcity.service.EnrollService;
import com.itcity.util.MybatisSqlSessionFactory;


public class EnrollServiceImpl implements EnrollService{

	@Override
	public void addEno(Enroll enroll) throws Exception{
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession(true);
		EnrollDao mapper = sqlSession.getMapper(EnrollDao.class);
		mapper.addEnroll(enroll);
		
	}

	@Override
	public List<Enroll> selAllEno() throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

}
