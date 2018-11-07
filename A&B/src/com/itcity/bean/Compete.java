package com.itcity.bean;

public class Compete {
	private String name;
	private int diffc;
	private String sort;
	private String master;
	public Compete(String name, int diffc, String sort, String master) {
		super();
		this.name = name;
		this.diffc = diffc;
		this.sort = sort;
		this.master = master;
	}
	public Compete() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiffc() {
		return diffc;
	}
	public void setDiffc(int diffc) {
		this.diffc = diffc;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	@Override
	public String toString() {
		return "Compete [name=" + name + ", diffc=" + diffc + ", sort=" + sort + ", master=" + master + "]";
	}
	
}
