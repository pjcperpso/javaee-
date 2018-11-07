package com.bigera.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.omg.IOP.CodecFactory;

public class JdbcFactor {
	private static String DRIVER;
	private static String URL;
	private static String USER;
	private static String PASSED;
	private static Properties properties = new Properties();
	private static Connection connection;
	static{
		File file = new File("D:/Git/GIT代码仓库/java/JavaPlayer/项目代码/Samecity_Web/src/jdbc.properties");
		try {
			FileInputStream inputStream = new FileInputStream(file);
			properties.load(inputStream);
			DRIVER = properties.getProperty("driver");
			URL = properties.getProperty("url");
			USER = properties.getProperty("user");
			PASSED = properties.getProperty("passwd");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConn(){
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
