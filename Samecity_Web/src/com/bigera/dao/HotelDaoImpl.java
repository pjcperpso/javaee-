package com.bigera.dao;

import java.lang.reflect.WildcardType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bigera.db.Hotel;
import com.bigera.util.JdbcFactor;

public class HotelDaoImpl implements HotelDao{
	private Connection conn;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	@Override
	public List<Hotel> selall() {
		conn = JdbcFactor.getConn();
		List<Hotel> list = new ArrayList<Hotel>();
		Hotel hotel = null;
		try {
			st = conn.createStatement();
			String sql = "select * from hotel";
			rs = st.executeQuery(sql);
			while(rs.next()){
				hotel = new Hotel();
				hotel.setId(rs.getString("id"));
				hotel.setName(rs.getString("name"));
				hotel.setRoomsum(rs.getInt("roomnum"));
				hotel.setIsparking(rs.getString("isparking"));
				hotel.setStartDate(rs.getDate("start_date"));
				hotel.setCity(rs.getString("city"));
				list.add(hotel);
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

	@Override
	public List<Hotel> selbycity(String message) {
		conn = JdbcFactor.getConn();
		List<Hotel> list = new ArrayList<Hotel>();
		Hotel hotel = null;
		String sql = null;
		try {
			st = conn.createStatement();
			if (message.contains("¾Æµê")) {
				sql = "select * from hotel where name='"+message+"'";
			}else{
				sql = "select * from hotel where city='"+message+"'";	
			}
			rs = st.executeQuery(sql);
			while(rs.next()){
				hotel = new Hotel();
				hotel.setId(rs.getString("id"));
				hotel.setName(rs.getString("name"));
				hotel.setRoomsum(rs.getInt("roomnum"));
				hotel.setIsparking(rs.getString("isparking"));
				hotel.setStartDate(rs.getDate("start_date"));
				hotel.setCity(rs.getString("city"));
				list.add(hotel);
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
