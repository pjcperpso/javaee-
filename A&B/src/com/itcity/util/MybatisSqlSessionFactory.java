package com.itcity.util;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSqlSessionFactory {
	private static SqlSessionFactory sqlSessionFactory;
	public static SqlSessionFactory getSqlSessionFactory() {
		if(sqlSessionFactory==null) {
			InputStream is = null;
			try {				
				is = Resources.getResourceAsStream("mybatis-config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(is) ;
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e.getCause());
			}					
		}
		return sqlSessionFactory;
	}
	//手动提交
	public static SqlSession openSession() {
		return openSession(false);
	}
	//自动提交
	public static SqlSession openSession(boolean autoCommit) {
		return getSqlSessionFactory().openSession(autoCommit);
	}
}