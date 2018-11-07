package com.itcity.service;

import java.util.List;
import java.util.Map;

import com.itcity.bean.Message;

public interface MessageService {
	void addMessage(Message message)throws Exception;
	List<Message> selmessages(Map<String, Object> map)throws Exception;
	List<Message> selHmessages(Map<String, Object> map)throws Exception;

}
