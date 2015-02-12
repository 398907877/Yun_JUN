package com.huake.edu.web.api.v1;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springside.modules.web.MediaTypes;

import com.huake.edu.entity.Course;
import com.huake.edu.entity.CourseCategory;

/**
 * 名师课堂API接口定义
 * @author laidingqing
 *
 */
@RestController
@RequestMapping(value = "/api/v1/courses")
public class CoursesController {

	/**
	 * 根据条件查询名师课堂视频列表
	 * @param category
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, produces = MediaTypes.JSON_UTF_8)
	public List<Course> list(@RequestParam(value = "category", required = true) Integer category){
		return null;
	}
	
	/**
	 * 获取热门课程
	 * @param category
	 * @return
	 */
	@RequestMapping(value="/populate", method = RequestMethod.GET, produces = MediaTypes.JSON_UTF_8)
	public List<Course> populate(@RequestParam(value = "category", required = true) Integer category){
		return null;
	}
	
}
