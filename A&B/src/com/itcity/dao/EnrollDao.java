package com.itcity.dao;

import java.util.List;

import com.itcity.bean.Enroll;

public interface EnrollDao {
	//添加报名信息
	void addEnroll(Enroll enroll);
	//查询所有报名信息
	List<Enroll> SelAllEnroll();
	
}
