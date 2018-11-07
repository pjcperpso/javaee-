package com.bigera.db;

public class TravleRote {
	private String id;
	private String name;
	private int num;
	private String sorta;
	private String sortb;
	private String sortc;
	private String tcid;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSorta() {
		return sorta;
	}
	public void setSorta(String sorta) {
		this.sorta = sorta;
	}
	public String getSortb() {
		return sortb;
	}
	public void setSortb(String sortb) {
		this.sortb = sortb;
	}
	public String getSortc() {
		return sortc;
	}
	public void setSortc(String sortc) {
		this.sortc = sortc;
	}
	public String getTcid() {
		return tcid;
	}
	public void setTcid(String tcid) {
		this.tcid = tcid;
	}
	@Override
	public String toString() {
		return "TravleRote [id=" + id + ", name=" + name + ", num=" + num + ", sorta=" + sorta + ", sortb=" + sortb
				+ ", sortc=" + sortc + ", tcid=" + tcid + "]";
	}
	
	
	
	
}
