package com.itcity.bean;

import java.sql.Date;

public class Message {
	/*
	 * ��id=1ʱ firstnameΪ��������Ϣ secondnameΪ����������Ϣ
	 * ��id=2ʱ firstnameΪ�ظ�����Ϣ secondnameΪ���ظ�����Ϣ
	 * */
	private String firstname;
	//��������
	private String secondname;
	//��ʦ����
	private String tname;
	//�ж���� Ϊ1ʱΪ������Ϣ  Ϊ2ʱΪ�ظ���Ϣ
	private int sortid;
	//���ۻ�ظ���Ϣ
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
