package com.bigera.userdao;

import java.util.List;
import java.util.Map;

import com.bigera.db.AirPort;
import com.bigera.db.AirTicket;
/*
 * һ�Զ��ϵ
 * */
public interface UAirDao {
	AirTicket selectticket(String name);
	//������ɵ�   ��    Ŀ�ĵز�����غ���
	AirPort selectbystartadd(String sadd);
	//��ѯ�ͼۺ���
	List<AirPort> selectport(double price);
	//������ɵ�   ��    Ŀ�ĵز�����غ���
	List<AirPort> selectAirbystartorstop(Map<String, Object> map);
	//�ͼۺ���
	
}

