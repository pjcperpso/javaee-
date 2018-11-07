package com.bigera.db;

public class TravleCompany {
	private String id;
	private String name;
	private String phone;
	private String data;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "TravleCompany [id=" + id + ", name=" + name + ", phone=" + phone + ", data=" + data + "]";
	}
	
}
