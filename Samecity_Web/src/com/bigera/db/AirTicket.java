package com.bigera.db;

public class AirTicket {
	private int at_id;
	private String name;
	private double price;
	private int surplus;
	private String ap_id;
	public AirTicket(){}
	
	public AirTicket(int at_id, String name, double price, int surplus, String ap_id) {
		this.at_id = at_id;
		this.name = name;
		this.price = price;
		this.surplus = surplus;
		this.ap_id = ap_id;
	}
	
	public int getAt_id() {
		return at_id;
	}

	public void setAt_id(int at_id) {
		this.at_id = at_id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSurplus() {
		return surplus;
	}
	public void setSurplus(int surplus) {
		this.surplus = surplus;
	}
	public String getAp_id() {
		return ap_id;
	}
	public void setAp_id(String ap_id) {
		this.ap_id = ap_id;
	}

	@Override
	public String toString() {
		return "AirTicket [at_id=" + at_id + ", name=" + name + ", price=" + price + ", surplus=" + surplus + ", ap_id="
				+ ap_id + "]";
	}
	

}
