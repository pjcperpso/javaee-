package com.bigera.test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bigera.db.AirPort;
import com.bigera.db.AirTicket;
import com.bigera.userdao.UAirDao;
import com.bigera.util.MBSqlSessionFactory;

public class sqltest {
	@Test
	public void seltest() {
		SqlSession sqlSession = MBSqlSessionFactory.getSqlSession(true);
		UAirDao mapper = sqlSession.getMapper(UAirDao.class);
		/*Map<String, Object> map = new HashMap<String, Object>();
		map.put("startadd", "����");
		map.put("stopadd", "����");*/
		//isEmpty����ֵΪ��     null�������Ϊ��
		//AirPort selectbystartadd = mapper.selectbystartadd("����");
		/*if (!sbs.isEmpty()) {
			System.out.println(sbs+"=="+sbs.size());	
		}else{
			System.out.println("�б���ֵ");
		}*/
		//System.out.println(selectbystartadd);
		/*List<AirPort> selectport = mapper.selectport(1500.0);
		System.out.println(selectport);*/
		//System.out.println(selectport.getAirticket().size());
		/*AirPort selectbystartadds = mapper.selectbystartadd("����");
		System.out.println(selectbystartadds);
		for(int i=0;i<selectbystartadds.getAirticket().size();i++){
			System.out.println(selectbystartadds.getAp_id()+"===="+selectbystartadds.getStarttime());
			System.out.println(selectbystartadds.getAirticket().get(i).getName());	
		}
		
		System.out.println(selectbystartadds.getAirticket().size());
		AirTicket selecttickets = mapper.selectticket("ͷ�Ȳ�");
		System.out.println(selecttickets);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startadd", "����");
		map.put("stopadd", "����");
		List<AirPort> selectAirbystartorstop = mapper.selectAirbystartorstop(map);
		System.out.println(selectAirbystartorstop);*/
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startadd", "����");
		map.put("stopadd", "����");
		List<AirPort> selectAirbystartorstop = mapper.selectAirbystartorstop(map);
		System.out.println(selectAirbystartorstop);
	}
}
