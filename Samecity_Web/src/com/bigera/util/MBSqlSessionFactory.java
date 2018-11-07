package com.bigera.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/*
 * 1.���ù���
 * 2.����sqlsession
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
	 * sqlsession�������
	 * 1.�ֶ��ύ  false
	 * 2.�Զ��ύ  true
	 * */
	
	//�ֶ��ύ  false
	public static SqlSession getSqlSession(){
		return getSqlSession(false);
	}
	
	//�Զ��ύ
	public static SqlSession getSqlSession(boolean flag){
		return getSqlSessionFactory().openSession(flag);
	}

}
