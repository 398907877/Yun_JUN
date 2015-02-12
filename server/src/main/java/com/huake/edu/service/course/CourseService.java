package com.huake.edu.service.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * 名师课堂服务
 * @author laidingqing
 *
 */
@Component
@Transactional
public class CourseService {

	@Autowired
	private CourseCategoryService courseCategoryService;
	

	public CourseCategoryService getCourseCategoryService() {
		return courseCategoryService;
	}

	public void setCourseCategoryService(CourseCategoryService courseCategoryService) {
		this.courseCategoryService = courseCategoryService;
	}
	
	
}
