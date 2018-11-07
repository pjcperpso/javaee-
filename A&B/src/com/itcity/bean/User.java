package com.itcity.bean;

import java.util.Date;

public class User {
	private String name;
	private String passwd;
	private int age;
	private String gender;
	private Compete compete;
	
	public User(String name, String passwd, int age, String gender, Compete compete) {
		super();
		this.name = name;
		this.passwd = passwd;
		this.age = age;
		this.gender = gender;
		this.compete = compete;
	}
	public User(String name, String passwd, int age, String gender) {
		this.name = name;
		this.passwd = passwd;
		this.age = age;
		this.gender = gender;
	}
	public User() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Compete getCompete() {
		return compete;
	}
	public void setCompete(Compete compete) {
		this.compete = compete;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", passwd=" + passwd + ", age=" + age + ", gender=" + gender + ", compete="
				+ compete + "]";
	}
	
}
