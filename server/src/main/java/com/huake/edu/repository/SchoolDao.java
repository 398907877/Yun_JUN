/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.huake.edu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.huake.edu.entity.School;

public interface SchoolDao extends PagingAndSortingRepository<School, Long> {
	@Query("select school  from School school where school.name=?1")
	School findByName(String name);

	
	
	
}
