package com.itcity.service;

import com.itcity.bean.User;

public interface UserService {
	public void register(User user)throws Exception;
	public User login(String name,String psw) throws Exception;
}
