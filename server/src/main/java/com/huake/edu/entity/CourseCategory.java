package com.huake.edu.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.huake.base.IdEntity;

/**
 * 课程分类实体，可按年级及其它划分
 * @author laidingqing
 *
 */
@Entity
@Table(name = "edu_course_categories")
public class CourseCategory extends IdEntity {

	/**
	 * 分类名称
	 */
	private String name;
	
	/**
	 * 父级编号
	 */
	private Integer parentId;
	
	/**
	 * 创建时间
	 */
	private Date crtDate;
	
	private List<Course> courses;
	
	private List<CourseCategory> children;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Date getCrtDate() {
		return crtDate;
	}

	public void setCrtDate(Date crtDate) {
		this.crtDate = crtDate;
	}

	@OneToMany(mappedBy = "category")
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Transient
	public List<CourseCategory> getChildren() {
		return children;
	}

	public void setChildren(List<CourseCategory> children) {
		this.children = children;
	}
	
	
}
