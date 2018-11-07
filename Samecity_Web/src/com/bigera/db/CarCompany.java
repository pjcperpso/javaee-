package com.bigera.db;

public class CarCompany {
	private String id;
	private String name;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "CarCompany [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	

}
