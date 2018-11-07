package com.bigera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bigera.db.AirTicket;
import com.bigera.util.JdbcFactor;

public class AirTicketDaoImpl implements AirTicketDao{
	private Connection conn;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	@Override
	public void addTicket(AirTicket airTicket) {
		conn = JdbcFactor.getConn();
		try {
			String sql = "insert into air_ticket values(at_id nextval,?,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, airTicket.getName());
			pst.setDouble(2, airTicket.getPrice());
			pst.setInt(3, airTicket.getSurplus());
			pst.setString(4, airTicket.getAp_id());
			pst.executeUpdate();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<AirTicket> selectair_t(String air_port_id) {
		List<AirTicket> list = new ArrayList<AirTicket>();
		AirTicket airTicket = null;
		try {
			conn = JdbcFactor.getConn();
			st = conn.createStatement();
			String sql = "select * from air_ticket where ap_id='"+air_port_id+"'";
			rs = st.executeQuery(sql);
			while(rs.next()){
				airTicket = new AirTicket();
				airTicket.setName(rs.getString("name"));
				airTicket.setPrice(rs.getDouble("price"));
				airTicket.setSurplus(rs.getInt("surplus"));
				airTicket.setAp_id(rs.getString("ap_id"));
				list.add(airTicket);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	

}
