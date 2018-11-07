package com.bigera.db;

import java.util.Date;
import java.util.List;

public class AirPort {
	private String ap_id;
	private String startadd;
	private String stopadd;
	private String amongadd;
	private Date starttime;
	private Date stoptime;
	private String orfoods;
	private String ac_id;
	private List<AirTicket> airticket;
	
	
	public AirPort(String ap_id, String startadd, String stopadd, String amongadd, Date starttime, Date stoptime,
			String orfoods, String ac_id, List<AirTicket> airticket) {
		this.ap_id = ap_id;
		this.startadd = startadd;
		this.stopadd = stopadd;
		this.amongadd = amongadd;
		this.starttime = starttime;
		this.stoptime = stoptime;
		this.orfoods = orfoods;
		this.ac_id = ac_id;
		this.airticket = airticket;
	}
	public AirPort(){}
	
	public String getAp_id() {
		return ap_id;
	}
	public void setAp_id(String ap_id) {
		this.ap_id = ap_id;
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
	public String getAmongadd() {
		return amongadd;
	}
	public void setAmongadd(String amongadd) {
		this.amongadd = amongadd;
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
	public String getOrfoods() {
		return orfoods;
	}
	public void setOrfoods(String orfoods) {
		this.orfoods = orfoods;
	}
	public String getAc_id() {
		return ac_id;
	}
	public void setAc_id(String ac_id) {
		this.ac_id = ac_id;
	}
	
	public List<AirTicket> getAirticket() {
		return airticket;
	}
	public void setAirticket(List<AirTicket> airticket) {
		this.airticket = airticket;
	}
	@Override
	public String toString() {
		return "AirPort [ap_id=" + ap_id + ", startadd=" + startadd + ", stopadd=" + stopadd + ", amongadd=" + amongadd
				+ ", starttime=" + starttime + ", stoptime=" + stoptime + ", orfoods=" + orfoods + ", ac_id=" + ac_id
				+ ", airticket=" + airticket + "]";
	}
	
}
