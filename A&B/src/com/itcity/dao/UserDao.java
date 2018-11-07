package com.itcity.dao;

import com.itcity.bean.User;

public interface UserDao {
	public void insertUser(User user);
	public void deleteUser(String name);
	public User selUser(String name);
}
