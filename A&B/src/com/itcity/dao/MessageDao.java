package com.itcity.dao;

import java.util.List;
import java.util.Map;

import com.itcity.bean.Message;

public interface MessageDao {
	//������Ϣ
	void insertmessage(Message message);
	//����sortid�ͽ�ʦ��������������Ϣ
	List<Message> selmessage(String teacher);
}
