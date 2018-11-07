package com.bigera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bigera.db.TravleStartAdd;
import com.bigera.util.JdbcFactor;

public class TravleSADaoImple implements TravleSADao{
	private Connection conn;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	@Override
	public List<TravleStartAdd> selall() {
		conn = JdbcFactor.getConn();
		List<TravleStartAdd> list = new ArrayList<TravleStartAdd>();
		try {
			TravleStartAdd travleStartAdd = null;
			st = conn.createStatement();
			String sql = "select * from travle_start order by price";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				travleStartAdd = new TravleStartAdd();
				travleStartAdd.setCity(rs.getString("name"));
				travleStartAdd.setPrice(rs.getDouble("price"));
				travleStartAdd.setTrid(rs.getString("tr_id"));
				list.add(travleStartAdd);	
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
