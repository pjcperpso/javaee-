package com.bigera.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bigera.db.TrainRote;
import com.bigera.util.JdbcFactor;

public class TrainRoteDaoImpl implements TrainRoteDao{
	private Connection conn;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;

	/*
	 * 添加rote信息
	 * */
	@Override
	public void addtrainrote(TrainRote trainRote) {
		conn = JdbcFactor.getConn();
		String sql = "insert into train_rote values(?,?,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, trainRote.getName());
			pst.setString(2,trainRote.getStartadd());
			pst.setString(3, trainRote.getStopadd());
			pst.setDate(4, trainRote.getStarttime());
			pst.setDate(5, trainRote.getStoptime());
			pst.setString(6, trainRote.getTc_id());
			pst.executeUpdate();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 查询火车rote表
	 * */
	@Override
	public List<TrainRote> seltrainrote() {
		List<TrainRote> list = new ArrayList<TrainRote>();
		conn = JdbcFactor.getConn();
		TrainRote trainRote = null;
		try {
			st = conn.createStatement();
			String sql = "select * from train_rote";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				trainRote = new TrainRote();
				trainRote.setName(rs.getString("name"));
				trainRote.setStartadd(rs.getString("start_add"));
				trainRote.setStopadd(rs.getString("stop_add"));
				trainRote.setStarttime(rs.getDate("start_time"));
				trainRote.setStoptime(rs.getDate("stop_time"));
				trainRote.setTc_id(rs.getString("tc_id"));
				list.add(trainRote);
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
