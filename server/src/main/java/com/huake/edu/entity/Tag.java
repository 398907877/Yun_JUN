package com.huake.edu.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.huake.base.IdEntity;

/**
 * 错题标签
 * @author laidingqing
 *
 */
@Entity
@Table(name = "edu_tags")
public class Tag extends IdEntity {

	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
