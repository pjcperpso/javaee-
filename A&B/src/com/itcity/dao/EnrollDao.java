package com.itcity.dao;

import java.util.List;

import com.itcity.bean.Enroll;

public interface EnrollDao {
	//��ӱ�����Ϣ
	void addEnroll(Enroll enroll);
	//��ѯ���б�����Ϣ
	List<Enroll> SelAllEnroll();
	
}
