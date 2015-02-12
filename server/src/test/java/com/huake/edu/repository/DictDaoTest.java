package com.huake.edu.repository;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import com.huake.dict.entity.Dictionary;
import com.huake.dict.repository.DictionaryDao;

@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DictDaoTest extends SpringTransactionalTestCase {

	@Autowired
	private DictionaryDao dictionaryDao;
	
	@Test
	public void findDictsByClassName() throws Exception {
		List<Dictionary> dicts = (List<Dictionary>)dictionaryDao.findAll();
		System.out.println("size:" + dicts.size());
	}
}
