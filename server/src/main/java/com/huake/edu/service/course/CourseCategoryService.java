package com.huake.edu.service.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.huake.edu.entity.CourseCategory;
import com.huake.edu.repository.CourseCategoryDao;

/**
 * 名师课堂分类服务
 * @author laidingqing
 *
 */
@Component
@Transactional
public class CourseCategoryService {

	@Autowired
	private CourseCategoryDao courseCategoryDao;
	
	/**
	 * 获取所有分类，包含父子结构
	 * @return
	 */
	public List<CourseCategory> getAllCategories(){
		
		return null;
	}
	
	public void addCatgegory(CourseCategory category){
		
	}

	public CourseCategoryDao getCourseCategoryDao() {
		return courseCategoryDao;
	}

	public void setCourseCategoryDao(CourseCategoryDao courseCategoryDao) {
		this.courseCategoryDao = courseCategoryDao;
	}
	
	
}
