package com.itcity.dao;

import java.util.List;
import java.util.Map;

import com.itcity.bean.Message;

public interface MessageDao {
	//插入信息
	void insertmessage(Message message);
	//根据sortid和教师姓名查找评论信息
	List<Message> selmessage(Map<String, Object> map);
	//根据sortid和教师姓名和被回复人的姓名查找回复信息
	List<Message> selHmessage(Map<String, Object> map);
}
