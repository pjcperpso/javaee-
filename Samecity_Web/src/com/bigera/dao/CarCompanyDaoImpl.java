package com.bigera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bigera.db.CarCompany;
import com.bigera.util.JdbcFactor;

public class CarCompanyDaoImpl implements CarCompanyDao{
	private Connection conn;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	@Override
	public List<CarCompany> sel_bycity(String city) {
		conn = JdbcFactor.getConn();
		CarCompany carCompany = null;
		List<CarCompany> list = new ArrayList<CarCompany>();
		try {
			st = conn.createStatement();
			String sql = "select * from car_company where city='"+city+"'";
			rs = st.executeQuery(sql);
			while(rs.next()){
				carCompany = new CarCompany();
				carCompany.setId(rs.getString("id"));
				carCompany.setName(rs.getString("name"));
				carCompany.setCity(rs.getString("city"));
				list.add(carCompany);
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
	public List<CarCompany> selall() {
		conn = JdbcFactor.getConn();
		List<CarCompany> list = new ArrayList<CarCompany>();
		CarCompany carCompany = null;
		try {
			st = conn.createStatement();
			String sql = "select * from car_company";
			rs = st.executeQuery(sql);
			while(rs.next()){
				carCompany = new CarCompany();
				carCompany.setId(rs.getString("id"));
				carCompany.setName(rs.getString("name"));
				carCompany.setCity(rs.getString("city"));
				list.add(carCompany);
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
