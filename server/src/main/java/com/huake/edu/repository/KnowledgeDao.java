package com.huake.edu.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.huake.edu.entity.Knowledge;


public interface KnowledgeDao  extends PagingAndSortingRepository<Knowledge, Long>, JpaSpecificationExecutor<Knowledge>{

	
	
}
