package com.bigera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bigera.db.Room;
import com.bigera.util.JdbcFactor;

public class RoomDaoImpl implements RoomDao{
	private Connection conn;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	@Override
	public List<Room> selall(String hid) {
		List<Room> list = new ArrayList<Room>();
		Room room = null;
		conn = JdbcFactor.getConn();
		try {
			st = conn.createStatement();
			String sql = "select * from room where c_id='"+hid+"' order by id";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				room = new Room();
				room.setId(rs.getInt("id"));
				room.setName(rs.getString("name"));
				room.setPrice(rs.getDouble("price"));
				room.setIsnull(rs.getString("isnull"));
				room.setIsairc(rs.getString("isairc"));
				room.setIsbath(rs.getString("isbedroom"));
				room.setIswindow(rs.getString("iswindow"));
				room.setBednum(rs.getInt("bednum"));
				room.setHid(rs.getString("c_id"));
				list.add(room);
				
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
