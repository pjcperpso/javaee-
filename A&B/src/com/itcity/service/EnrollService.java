package com.itcity.service;

import java.util.List;

import com.itcity.bean.Enroll;

public interface EnrollService {
	//����������Ϣ
	void addEno(Enroll enroll)throws Exception;
	//��ѯȫ��������Ϣ
	List<Enroll> selAllEno()throws Exception;
}
