package com.huake.edu.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.huake.base.IdEntity;

/**
 * 名师课程实体
 * @author laidingqing
 *
 */
@Entity
@Table(name = "edu_courses")
public class Course extends IdEntity {

	/**
	 * 课程分类
	 */
	private CourseCategory category;  
	
	/**
	 * 课程标题
	 */
	@Column(name = "title")
	private String title;
	
	/**
	 * 课程简介
	 */
	@Column(name = "brief")
	private String brief;
	
	/**
	 * 价格
	 */
	@Column(name = "price")
	private BigDecimal price;
	
	/**
	 * 时长
	 */
	@Column(name = "duration")
	private String duration;
	
	/**
	 * 课件，保存文件路径，以pdf或PPT等形式保存
	 */
	@Column(name = "courseware")
	private String courseware;
	
	/**
	 * 创建时间
	 */
	@Column(name = "created_at")
	@Temporal(TemporalType.TIME)
	private Date crtDate;
	
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIME)
	private Date uptDate;
	
	private TeacherMember techMember;

	@ManyToOne
	@JoinColumn(name="category_Id")
	public CourseCategory getCategory() {
		return category;
	}

	public void setCategory(CourseCategory category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCourseware() {
		return courseware;
	}

	public void setCourseware(String courseware) {
		this.courseware = courseware;
	}

	public Date getCrtDate() {
		return crtDate;
	}

	public void setCrtDate(Date crtDate) {
		this.crtDate = crtDate;
	}

	@ManyToOne
	@JoinColumn(name="teacher_Id")
	public TeacherMember getTechMember() {
		return techMember;
	}

	public void setTechMember(TeacherMember techMember) {
		this.techMember = techMember;
	}

	public Date getUptDate() {
		return uptDate;
	}

	public void setUptDate(Date uptDate) {
		this.uptDate = uptDate;
	}
	
}
