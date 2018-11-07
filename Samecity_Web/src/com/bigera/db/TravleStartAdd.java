package com.bigera.db;

public class TravleStartAdd {
	private String city;
	private double price;
	private String trid;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTrid() {
		return trid;
	}
	public void setTrid(String trid) {
		this.trid = trid;
	}
	@Override
	public String toString() {
		return "TravleStartAdd [city=" + city + ", price=" + price + ", trid=" + trid + "]";
	}
	
}
