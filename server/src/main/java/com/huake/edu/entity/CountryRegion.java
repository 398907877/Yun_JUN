package com.huake.edu.entity;

import java.util.List;

/**
 * 省（直辖市）实体，不作数据库ORM
 * @author skylai
 *
 */
public class CountryRegion {
	private String name;
	private String code;
	
	private List<State> childStates;
	
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
	public List<State> getChildStates() {
		return childStates;
	}
	public void setChildStates(List<State> childStates) {
		this.childStates = childStates;
	}
	
}
