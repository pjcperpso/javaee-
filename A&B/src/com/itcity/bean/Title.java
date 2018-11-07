package com.itcity.bean;

public class Title {
	private String id;
	private String name;
	private int sort;
	private int score;
	private int time;
	public Title(String id, String name, int sort, int score, int time) {
		super();
		this.id = id;
		this.name = name;
		this.sort = sort;
		this.score = score;
		this.time = time;
	}
	public Title() {
		super();
	}
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
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Title [id=" + id + ", name=" + name + ", sort=" + sort + ", score=" + score + ", time=" + time + "]";
	}
	
}
