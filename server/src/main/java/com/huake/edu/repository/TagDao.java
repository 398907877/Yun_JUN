package com.huake.edu.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.huake.edu.entity.Tag;

/**
 * 标签数据提供
 * @author laidingqing
 *
 */
public interface TagDao extends PagingAndSortingRepository<Tag, Long>, JpaSpecificationExecutor<Tag>{

}
