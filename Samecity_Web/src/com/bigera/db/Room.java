package com.bigera.db;

public class Room {
	private int id;
	private String name;
	private double price;
	private String iswindow;
	private String isbath;
	private String isairc;
	private int bednum;
	private String isnull;
	public String getIsnull() {
		return isnull;
	}

	public void setIsnull(String isnull) {
		this.isnull = isnull;
	}

	private String hid;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getIswindow() {
		return iswindow;
	}

	public void setIswindow(String iswindow) {
		this.iswindow = iswindow;
	}

	public String getIsbath() {
		return isbath;
	}

	public void setIsbath(String isbath) {
		this.isbath = isbath;
	}

	public String getIsairc() {
		return isairc;
	}

	public void setIsairc(String isairc) {
		this.isairc = isairc;
	}

	public int getBednum() {
		return bednum;
	}

	public void setBednum(int bednum) {
		this.bednum = bednum;
	}

	public String getHid() {
		return hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", price=" + price + ", iswindow=" + iswindow + ", isbath="
				+ isbath + ", isairc=" + isairc + ", bednum=" + bednum + ", isnull=" + isnull + ", hid=" + hid + "]";
	}

	
	
}
