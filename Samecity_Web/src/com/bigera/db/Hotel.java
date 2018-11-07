package com.bigera.db;

import java.sql.Date;

public class Hotel {
	private String id;
	private String name;
	private int roomsum;
	private String isparking;
	private Date startDate;
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
	public int getRoomsum() {
		return roomsum;
	}
	public void setRoomsum(int roomsum) {
		this.roomsum = roomsum;
	}
	public String getIsparking() {
		return isparking;
	}
	public void setIsparking(String isparking) {
		this.isparking = isparking;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", roomsum=" + roomsum + ", isparking=" + isparking
				+ ", startDate=" + startDate + ", city=" + city + "]";
	}
	

}
