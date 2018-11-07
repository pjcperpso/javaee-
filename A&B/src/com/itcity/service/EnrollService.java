package com.itcity.service;

import java.util.List;

import com.itcity.bean.Enroll;

public interface EnrollService {
	//新增报名信息
	void addEno(Enroll enroll)throws Exception;
	//查询全部报名信息
	List<Enroll> selAllEno()throws Exception;
}
