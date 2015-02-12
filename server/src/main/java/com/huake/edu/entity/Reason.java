package com.huake.edu.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.huake.base.IdEntity;

/**
 * 题目错误原因记录.
 * @author laidingqing
 *
 */
@Entity
@Table(name = "edu_reasons")
public class Reason extends IdEntity {

	/**
	 * 概述错误原因
	 */
	private String summary;
	
	/**
	 * 关联错题编号
	 */
	private Integer noteBookId;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Integer getNoteBookId() {
		return noteBookId;
	}

	public void setNoteBookId(Integer noteBookId) {
		this.noteBookId = noteBookId;
	}
	
}
