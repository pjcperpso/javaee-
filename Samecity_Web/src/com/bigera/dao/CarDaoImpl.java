package com.bigera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bigera.db.Car;
import com.bigera.db.CarCompany;
import com.bigera.util.JdbcFactor;

public class CarDaoImpl implements CarDao{
	private Connection conn;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	@Override
	public List<Car> sel_byccid(String ccid) {
		conn = JdbcFactor.getConn();
		List<Car> list = new ArrayList<Car>();
		Car car = null;
			try {
				st = conn.createStatement();
				String sql = "select * from car where cc_id='"+ccid+"'";
				rs = st.executeQuery(sql);
				while(rs.next()){
					car = new Car();
					car.setId(rs.getString("id"));
					car.setName(rs.getString("name"));
					car.setProdate(rs.getDate("pro_date"));
					car.setPrice(rs.getDouble("price"));
					car.setOrsell(rs.getString("orsell"));
					car.setCcid(rs.getString("cc_id"));
					list.add(car);
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
