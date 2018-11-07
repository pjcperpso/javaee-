package com.bigera.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/*
 * 1.先拿工厂
 * 2.再拿sqlsession
 * */
public class MBSqlSessionFactory {
	private static SqlSessionFactory sqlSessionFactory;
	public static SqlSessionFactory getSqlSessionFactory(){
		if (sqlSessionFactory==null){
			InputStream is = null;
			try {
				is = Resources.getResourceAsStream("mybatis-config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}
	
	/*
	 * sqlsession两种情况
	 * 1.手动提交  false
	 * 2.自动提交  true
	 * */
	
	//手动提交  false
	public static SqlSession getSqlSession(){
		return getSqlSession(false);
	}
	
	//自动提交
	public static SqlSession getSqlSession(boolean flag){
		return getSqlSessionFactory().openSession(flag);
	}

}
