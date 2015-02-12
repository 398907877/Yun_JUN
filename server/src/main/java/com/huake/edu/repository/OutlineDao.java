package com.huake.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.huake.edu.entity.Knowledge;
import com.huake.edu.entity.Outline;

/**
 * 教学大纲数据提供
 * @author laidingqing
 *
 */
public interface OutlineDao extends PagingAndSortingRepository<Outline, Long>, JpaSpecificationExecutor<Outline>{
	//更具课程名称删除   本大纲
	@Modifying
	@Query("delete Outline o where o.lesson=?1")
	void deleteOutlineByLesson(String lesson );
	
	//更具知识点的标题 ，找到大纲的课程
	@Query("select o.outline.lesson from Knowledge o where o.title=?1")
	String findLessonByKnowTitle(String title);
	
	//填入大纲的课程显示所有知识点
	@Query(" select o.knowledges from  Outline o  where o.lesson=?1 ")
	List<Knowledge> findKnowledgeByLesson(String lesson );


}


