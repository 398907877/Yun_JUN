package com.huake.edu.service.tag;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.huake.edu.entity.Tag;

@Component
@Transactional
public class TagService {

	/**
	 * 获得受欢迎的标签
	 * @return
	 */
	public List<Tag> findPopularTags(){
		return null;
	}
}
