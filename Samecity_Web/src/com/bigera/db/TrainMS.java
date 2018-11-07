package com.bigera.db;

import java.sql.Date;

public class TrainMS {
	private String name;
	private Date reachtime;
	private Date starttime;
	private int staytime;
	private String trname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getReachtime() {
		return reachtime;
	}
	public void setReachtime(Date reachtime) {
		this.reachtime = reachtime;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public int getStaytime() {
		return staytime;
	}
	public void setStaytime(int staytime) {
		this.staytime = staytime;
	}
	public String getTrname() {
		return trname;
	}
	public void setTrname(String trname) {
		this.trname = trname;
	}
	@Override
	public String toString() {
		return "TrainMS [name=" + name + ", reachtime=" + reachtime + ", starttime=" + starttime + ", staytime="
				+ staytime + ", trname=" + trname + "]";
	}
	

}
