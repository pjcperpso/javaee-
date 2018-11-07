package com.bigera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bigera.db.TravleRote;
import com.bigera.util.JdbcFactor;

public class TravleRoteDaoImpl implements TravleRoteDao{
	private Connection conn;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	@Override
	public List<TravleRote> selallrote() {
		List<TravleRote> list = new ArrayList<TravleRote>();
		TravleRote travleRote = null;
		conn = JdbcFactor.getConn();
		try {
			st = conn.createStatement();
			String sql = "select * from travle_rote";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				travleRote = new TravleRote();
				travleRote.setId(rs.getString("id"));
				travleRote.setName(rs.getString("name"));
				travleRote.setNum(rs.getInt("sort"));
				travleRote.setSorta(rs.getString("sort_A"));
				travleRote.setSortb(rs.getString("sort_B"));
				travleRote.setSortc(rs.getString("sort_C"));
				travleRote.setTcid(rs.getString("tc_id"));
				list.add(travleRote);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public List<TravleRote> selbyname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
