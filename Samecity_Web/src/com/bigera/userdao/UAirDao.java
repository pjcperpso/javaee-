package com.bigera.userdao;

import java.util.List;
import java.util.Map;

import com.bigera.db.AirPort;
import com.bigera.db.AirTicket;
/*
 * 一对多关系
 * */
public interface UAirDao {
	AirTicket selectticket(String name);
	//根据起飞地   和    目的地查找相关航班
	AirPort selectbystartadd(String sadd);
	//查询低价航班
	List<AirPort> selectport(double price);
	//根据起飞地   和    目的地查找相关航班
	List<AirPort> selectAirbystartorstop(Map<String, Object> map);
	//低价航班
	
}

