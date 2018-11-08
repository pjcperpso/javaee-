package com.itcity.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.itcity.bean.Message;
import com.itcity.dao.MessageDao;
import com.itcity.service.MessageService;
import com.itcity.util.MybatisSqlSessionFactory;

public class MessageServiceImpl implements MessageService{

	@Override
	public void addMessage(Message message) throws Exception {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession(true);
		MessageDao mapper = sqlSession.getMapper(MessageDao.class);
		mapper.insertmessage(message);
	}

	@Override
	public List<Message> selmessages(String message) throws Exception {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession(true);
		MessageDao mapper = sqlSession.getMapper(MessageDao.class);
		List<Message> selmessage = mapper.selmessage(message);
		if (selmessage!=null) {
			return selmessage;
		}else{
			throw new Exception("当前暂无评论数据");
		}
	}
}
