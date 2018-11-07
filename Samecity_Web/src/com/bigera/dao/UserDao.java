package com.bigera.dao;

import java.util.List;

import com.bigera.db.User;

public interface UserDao {
	public User selectuser(String name) throws Exception;
	public void insertuser(User user) throws Exception;

}
