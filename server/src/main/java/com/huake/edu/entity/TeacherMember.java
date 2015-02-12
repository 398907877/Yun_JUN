package com.huake.edu.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 老师用户信息
 * @author laidingqing
 *
 */
@Entity
@Table(name = "edu_members_teachers")
@DiscriminatorValue("teacher")
public class TeacherMember extends Member{

	
	private List<Course> courses;

	//@OneToMany(mappedBy="techMember")
	@Transient
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
}
