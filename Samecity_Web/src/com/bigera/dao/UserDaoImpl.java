package com.bigera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

import com.bigera.db.User;
import com.bigera.util.JdbcFactor;

public class UserDaoImpl implements UserDao{
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	private Connection conn = JdbcFactor.getConn();

	/*
	 * 查询用户
	 * */
	@Override
	public User selectuser(String name) throws Exception {
		User user = null;
		String sql = "select * from sp_user where name='"+name+"'";
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		while(rs.next()){
			user = new User(rs.getInt("id"),rs.getString("name"),rs.getString("passwd"),rs.getInt("age"),rs.getString("gender"),rs.getString("hobby"));
		}
		return user;
	}

	/*
	 * 用户注册
	 * */
	@Override
	public void insertuser(User user) throws Exception{
		String sql = "insert into sp_user values(spu_id.nextval,?,?,?,?,?)";
		pst = conn.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getPasswd());
		pst.setInt(3, user.getAge());
		pst.setString(4, user.getGender());
		pst.setString(5, user.getHobby());
		pst.executeUpdate();
	}
	
}
