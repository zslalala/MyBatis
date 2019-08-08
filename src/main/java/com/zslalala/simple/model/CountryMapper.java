package com.zslalala.simple.model;

public class CountryMapper {
	
	@Override
	public String toString() {
		return "CountryMapper [id=" + id + ", countryname=" + countryname + ", countrycode=" + countrycode + "]";
	}
	private long id;
	private String countryname;
	private String countrycode;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

}
