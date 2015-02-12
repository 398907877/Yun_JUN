package com.huake.edu.entity;

import java.util.List;

/**
 * 行政区域市及实体，不作数据库ORM
 * @author skylai
 *
 */
public class State {

	private String name;
	
	private String code;
	
	private CountryRegion region;
	
	private List<City> childCities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public CountryRegion getRegion() {
		return region;
	}

	public void setRegion(CountryRegion region) {
		this.region = region;
	}

	public List<City> getChildCities() {
		return childCities;
	}

	public void setChildCities(List<City> childCities) {
		this.childCities = childCities;
	}
	
	
}
