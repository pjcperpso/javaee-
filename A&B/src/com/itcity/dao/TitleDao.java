package com.itcity.dao;

import java.util.List;

import com.itcity.bean.Title;

public interface TitleDao {
	//��ѯ���������id����
	List<Title> selAllTitle(int id);
	//����id��ѯ�����Ϣ
	Title selOneTitle(int id);
}
