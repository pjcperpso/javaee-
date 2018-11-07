package com.bigera.db;

import javax.xml.crypto.Data;

public class User {
	private String name;
	private String passwd;
	private int age;
	private String gender;
	private String hobby;
	private int id;
	public User(int id,String name, String passwd,int age, String gender, String hobby) {
		this.id = id;
		this.name = name;
		this.passwd = passwd;
		this.age = age;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public User(){}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gender=" + gender + ", hobby=" + hobby + "]";
	}
	

}
