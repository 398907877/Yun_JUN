package com.huake.edu.entity;

import com.huake.base.IdEntity;

/**
 * 试卷实体，如2013年中考湖南语文卷，2014年期中考语文卷
 * @author laidingqing
 *
 */
public class Examination extends IdEntity {

	/**
	 * 试卷名称
	 */
	private String name;
	
	/**
	 * 年级，来自于字典
	 */
	private String grade;
	
	/**
	 * 年份
	 */
	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
