package com.huake.edu.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.huake.base.IdEntity;

/**
 * 教学大纲表
 * @author laidingqing
 *
 */
@Entity
@Table(name = "edu_outlines")
public class Outline extends IdEntity {
	
	@NotEmpty(message="用户名不能为空")
	private String outlinename;

	public String getOutlinename() {
		return outlinename;
	}
	
	public void setOutlinename(String outlinename) {
		this.outlinename = outlinename;
	}

	/**
	 * 学科，来自于字典
	 */
	private String subject;
	
	/**
	 * 年级，来自于字典
	 */
	private String grade;
	
	
	/**
	 * 版本，有不同的版本，如人教版。。。，来自于字典
	 */
	private String edition;
	
	/**
	 * 哪年公布的教学大纲版本
	 */
	private String year;
	
	/**
	 * 单元
	 */
	private String unit;
	
	/**
	 * 课文
	 */
	private String lesson;
	
	/**
	 * 所属父类大纲
	 */
	private Integer parentId;
	/**
	 * 所属子类大纲
	 */
	private Integer kidId;
	
	
	
	public Integer getKidId() {
		return kidId;
	}

	public void setKidId(Integer kidId) {
		this.kidId = kidId;
	}

	/**
	 * 大纲对应知识点
	 */
	private List<Knowledge> knowledges;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@OneToMany(mappedBy = "outline")
	public List<Knowledge> getKnowledges() {
		return knowledges;
	}

	public void setKnowledges(List<Knowledge> knowledges) {
		this.knowledges = knowledges;
	}
	
	
}
