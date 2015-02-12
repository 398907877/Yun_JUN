package com.huake.edu.entity;

import java.util.List;

import com.huake.base.IdEntity;

/**
 * 错题本实体
 * <p>记录错题本主要要素</p>
 * @author laidingqing
 *
 */
public class SpecialNoteBook extends IdEntity {

	/**
	 * 原题标题
	 */
	private String question;
	
	/**
	 * 年级字典值
	 */
	private String grade;
	
	/**
	 * 原题答错与否
	 */
	private Boolean respond;
	
	/**
	 * 错题原因。汇总多个
	 */
	private List<Reason> reasons;
	
	/**
	 * 对应教学大纲
	 */
	private Outline outline;


	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Outline getOutline() {
		return outline;
	}

	public void setOutline(Outline outline) {
		this.outline = outline;
	}

	public Boolean getRespond() {
		return respond;
	}

	public void setRespond(Boolean respond) {
		this.respond = respond;
	}

	public List<Reason> getReasons() {
		return reasons;
	}

	public void setReasons(List<Reason> reasons) {
		this.reasons = reasons;
	}
	
	
}
