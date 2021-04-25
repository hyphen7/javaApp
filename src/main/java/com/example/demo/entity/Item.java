package com.example.demo.entity;

public class Item {

	int id;
	String business;
	String theme;
	String date;
	String detail;
	String name;

	public Item(int id, String business, String theme, String date, String detail, String name) {
		this.id = id;
		this.business = business;
		this.theme = theme;
		this.date = date;
		this.detail = detail;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
