package com.itcity.bean;

public class Enroll {
	private Long id;
	private String c_name;
	private String u_name;
	private String name;
	private String shenfen;
	private int age;
	private String gender;
	private String school;
	private String email;
	private String phone;
	public Enroll(Long id, String c_name, String u_name, String name, String shenfen, int age, String gender,
			String school, String email, String phone) {
		super();
		this.id = id;
		this.c_name = c_name;
		this.u_name = u_name;
		this.name = name;
		this.shenfen = shenfen;
		this.age = age;
		this.gender = gender;
		this.school = school;
		this.email = email;
		this.phone = phone;
	}
	public Enroll() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShenfen() {
		return shenfen;
	}
	public void setShenfen(String shenfen) {
		this.shenfen = shenfen;
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Enroll [id=" + id + ", c_name=" + c_name + ", u_name=" + u_name + ", name=" + name + ", shenfen="
				+ shenfen + ", age=" + age + ", gender=" + gender + ", school=" + school + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	

}
