package com.bigera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bigera.db.AirPort;
import com.bigera.util.JdbcFactor;

public class AirPortDaoImpl implements AirPortDao{
	private static PreparedStatement pst;
	private static Statement st;
	private static ResultSet rs;

	@Override
	public List<AirPort> selectair() {
		List<AirPort> list = new ArrayList<AirPort>();
		AirPort airPort = null;
		try {
			Connection conn = JdbcFactor.getConn();
			st = conn.createStatement();
			String sql = "select * from air_port";
			rs = st.executeQuery(sql);
			while(rs.next()){
				//
				airPort = new AirPort();
				airPort.setAp_id(rs.getString("id"));
				airPort.setStartadd(rs.getString("start_add"));
				airPort.setStopadd(rs.getString("stop_add"));
				airPort.setAmongadd(rs.getString("among_add"));
				airPort.setStarttime(rs.getDate("start_time"));
				airPort.setStoptime(rs.getDate("stop_time"));
				airPort.setOrfoods(rs.getString("food"));
				airPort.setAc_id(rs.getString("ac_id"));
				list.add(airPort);
			}
			rs.close();
			st.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
}
