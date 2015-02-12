package com.huake.edu.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.huake.edu.entity.CourseCategory;

public interface CourseCategoryDao extends PagingAndSortingRepository<CourseCategory, Integer>, JpaSpecificationExecutor<CourseCategory>{

}
