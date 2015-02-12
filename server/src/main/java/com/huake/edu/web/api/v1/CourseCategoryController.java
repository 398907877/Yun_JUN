package com.huake.edu.web.api.v1;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springside.modules.web.MediaTypes;

import com.huake.edu.entity.CourseCategory;

/**
 * 名师课堂内容分类接口
 * @author skylai
 *
 */
public class CourseCategoryController {

	@RequestMapping(value="", method = RequestMethod.GET, produces = MediaTypes.JSON_UTF_8)
	public List<CourseCategory> listCourseCategories() {
		return null;
	}
}
