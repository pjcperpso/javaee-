package com.bigera.db;

import java.sql.Date;

public class TrainRote {
	private String name;
	private Date starttime;
	private Date stoptime;
	private String startadd;
	private String stopadd;
	private String tc_id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getStoptime() {
		return stoptime;
	}
	public void setStoptime(Date stoptime) {
		this.stoptime = stoptime;
	}
	public String getStartadd() {
		return startadd;
	}
	public void setStartadd(String startadd) {
		this.startadd = startadd;
	}
	public String getStopadd() {
		return stopadd;
	}
	public void setStopadd(String stopadd) {
		this.stopadd = stopadd;
	}
	public String getTc_id() {
		return tc_id;
	}
	public void setTc_id(String tc_id) {
		this.tc_id = tc_id;
	}
	@Override
	public String toString() {
		return "TrainRote [name=" + name + ", starttime=" + starttime + ", stoptime=" + stoptime + ", startadd="
				+ startadd + ", stopadd=" + stopadd + ", tc_id=" + tc_id + "]";
	}
	

}
