package com.itcity.dao;

import java.util.List;

import com.itcity.bean.Title;

public interface TitleDao {
	//查询所有题根据id排序
	List<Title> selAllTitle(int id);
	//根据id查询相关信息
	Title selOneTitle(int id);
}
