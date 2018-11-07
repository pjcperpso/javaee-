package com.bigera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bigera.db.TrainMS;
import com.bigera.util.JdbcFactor;

public class TrainMSDaoImpl implements TrainMSDao{
	private Connection conn;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;

	/*
	 * 查询火车经停信息
	 * */
	@Override
	public List<TrainMS> selmidstation(String trname) {
		List<TrainMS> list = new ArrayList<TrainMS>();
		TrainMS trainMS;
		try {
			conn = JdbcFactor.getConn();
			st = conn.createStatement();
			String sql = "select * from train_midstation where tr_name='"+trname+"'";
			rs = st.executeQuery(sql);
			while(rs.next()){
				trainMS = new TrainMS();
				trainMS.setName(rs.getString("name"));
				trainMS.setReachtime(rs.getDate("reach_time"));
				trainMS.setStarttime(rs.getDate("start_time"));
				trainMS.setStaytime(rs.getInt("stay_time"));
				trainMS.setTrname(rs.getString("tr_name"));
				list.add(trainMS);
			}
			rs.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
