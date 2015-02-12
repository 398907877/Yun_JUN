package com.huake.edu.entity;

/**
 * 行政区域县（区）实体，不作数据库ORM
 * @author skylai
 *
 */
public class City {

	private String name;
	
	private String code;
	
	private State state;

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

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
