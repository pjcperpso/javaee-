package com.itcity.service;

import java.util.List;

import com.itcity.bean.Title;

public interface TitleService {
	List<Title> selTitles(int id) throws Exception;
	Title selonetitle(int id)throws Exception;
}
