/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.huake.edu.service.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.huake.edu.entity.School;
import com.huake.edu.repository.SchoolDao;

/**
 * 学校管理类.
 * 
 * @author calvin
 */
// Spring Service Bean的标识.
/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
@Component
@Transactional
public class SchoolService {
	
	private SchoolDao schoolDao;
	
	
	/**查询出所有学校
	 * @return
	 */
	public List<School> getAllSchool() {
		return (List<School>) schoolDao.findAll();
	}
	
	/**根据id查询出学校
	 * @param id
	 * @return
	 */
	public School getSchool(Long id) {
		return schoolDao.findOne(id);
	}
	
	/**分页查询
	 * @param pageable 可放入page，size参数
	 * @return
	 */
	public Page<School> findAllByPage(int page,int size,String sortName){
		return schoolDao.findAll(new PageRequest(page,size,new Sort(new Order(Direction. DESC,sortName))));
	}					
	
	
	/**根据学校名字查找学校数据
	 * @param name
	 * @return
	 */
	public School findSchoolByName(String name) {
		return schoolDao.findByName(name);
	}

	/**新增学校
	 * @param school
	 */
	public void updateSchool(School school) {
		schoolDao.save(school);
	}

	/**根据id删除学校
	 * @param id
	 */
	public void deleteSchool(Long id) {
		schoolDao.delete(id);
	}
	
	public Page<School> getSchool(int pageNumber, int pageSize,String sortType) {
		PageRequest pageRequest = buildPageRequest(pageNumber, pageSize, sortType);

		return schoolDao.findAll(pageRequest);
	}

	/**
	 * 创建分页请求.
	 */
	private PageRequest buildPageRequest(int pageNumber, int pagzSize, String sortType) {
		Sort sort = null;
		if ("auto".equals(sortType)) {
			sort = new Sort(Direction.DESC, "id");
		} else if ("title".equals(sortType)) {
			sort = new Sort(Direction.ASC, "title");
		}

		return new PageRequest(pageNumber - 1, pagzSize, sort);
	}

	@Autowired
	public void setSchoolDao(SchoolDao schoolDao) {
		this.schoolDao = schoolDao;
	}
}

