package com.example.coolweather.model;

public class County {
	private int id;
	private String county_name;
	private String county_code;
	private int city_code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCounty_name() {
		return county_name;
	}

	public void setCounty_name(String county_name) {
		this.county_name = county_name;
	}

	public String getCounty_code() {
		return county_code;
	}

	public void setCounty_code(String county_code) {
		this.county_code = county_code;
	}

	public int getCity_code() {
		return city_code;
	}

	public void setCity_code(int city_code) {
		this.city_code = city_code;
	}

	public County() {
		super();
	}

	public County(int id, String county_name, String county_code,
			Integer city_code) {
		super();
		this.id = id;
		this.county_name = county_name;
		this.county_code = county_code;
		this.city_code = city_code;
	}
}
