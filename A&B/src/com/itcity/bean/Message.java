package com.itcity.bean;

import java.sql.Date;

public class Message {
	/*
	 * 当id=1时 firstname为评论人信息 secondname为被评论者信息
	 * 当id=2时 firstname为回复人信息 secondname为被回复者信息
	 * */
	private String firstname;
	//评论姓名
	private String secondname;
	//教师姓名
	private String tname;
	//判断类别 为1时为评论信息  为2时为回复信息
	private int sortid;
	//评论或回复信息
	private String message;
	//
	private Date nowdate;
	public Message() {
		super();
	}

	public Message(String firstname, String secondname, String tname, int sortid, String message, Date nowdate) {
		super();
		this.firstname = firstname;
		this.secondname = secondname;
		this.tname = tname;
		this.sortid = sortid;
		this.message = message;
		this.nowdate = nowdate;
	}




	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	public int getSortid() {
		return sortid;
	}

	public void setSortid(int sortid) {
		this.sortid = sortid;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Date getNowdate() {
		return nowdate;
	}

	public void setNowdate(Date nowdate) {
		this.nowdate = nowdate;
	}

	@Override
	public String toString() {
		return "Message [firstname=" + firstname + ", secondname=" + secondname + ", tname=" + tname + ", sortid="
				+ sortid + ", message=" + message + ", nowdate=" + nowdate + "]";
	}

	

	
}
