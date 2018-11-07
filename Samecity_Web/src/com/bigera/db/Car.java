package com.bigera.db;

import java.sql.Date;

public class Car {
	private String id;
	private String name;
	private Date prodate;
	private double price;
	private String orsell;
	private String ccid;
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
	public Date getProdate() {
		return prodate;
	}
	public void setProdate(Date prodate) {
		this.prodate = prodate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOrsell() {
		return orsell;
	}
	public void setOrsell(String orsell) {
		this.orsell = orsell;
	}
	public String getCcid() {
		return ccid;
	}
	public void setCcid(String ccid) {
		this.ccid = ccid;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", prodate=" + prodate + ", price=" + price + ", orsell=" + orsell
				+ ", ccid=" + ccid + "]";
	}
	
	

}
