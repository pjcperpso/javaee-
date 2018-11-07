package com.itcity.service.impl;

import java.awt.print.Book;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.itcity.bean.User;
import com.itcity.dao.UserDao;
import com.itcity.service.UserService;
import com.itcity.util.MybatisSqlSessionFactory;

public class UserServiceImpl implements UserService{

	/*
	 * 注册register
	 * */
	@Override
	public void register(User user) throws Exception{
		SqlSession sqlSession =  MybatisSqlSessionFactory.openSession(true);
		UserDao userdao = sqlSession.getMapper(UserDao.class);
		//userdao.insertUser(user);
		User selUser = userdao.selUser(user.getName());
		if (selUser==null) {
			userdao.insertUser(user);
		}else{
			System.out.println("该用户存在");
		}
		
	}
	/*
	 * 登录login
	 * */

	@Override
	public User login(String name,String psw) throws Exception{
		SqlSession sqlsession = MybatisSqlSessionFactory.openSession(true);
		UserDao mapper = sqlsession.getMapper(UserDao.class);
		User user = mapper.selUser(name);
		if(user!=null){
			if(user.getName().equals(name)&&user.getPasswd().equals(psw)){
				return user;
			}else{
				throw new Exception("同户名或密码错误");
			}
		}else{
			throw new Exception("该用户不存在");
		}
	}
	
}
