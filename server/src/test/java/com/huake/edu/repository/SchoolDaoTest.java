package com.huake.edu.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import com.huake.edu.entity.School;
import com.huake.edu.service.school.SchoolService;

@ContextConfiguration(locations = { "/applicationContext.xml" })
@TransactionConfiguration(defaultRollback = false)
public class SchoolDaoTest extends SpringTransactionalTestCase{
@Autowired
private SchoolDao schooldao;
@Autowired
private SchoolService schoolService;

//查询
@Test
public void findSchoolByName(){
 School school= schooldao.findByName("仓山第一小学");
 System.out.println(school);
}



//删除
@Test
public void deleteByName(){ 
	School school=schooldao.findByName("name");
	System.out.println(school);
	schooldao.delete(school.getId());
}
//新增
@Test
public void saveSchool(){
	School school=new School();
	school.setName("仓山第一小学");
	school.setAbbr("仓一小");
	school.setProvince("福建");
	school.setCity("福州");
	school.setArea("仓山");
	schooldao.save(school);	
}
//更新
@Test
public void update(){
	School school=schooldao.findByName("仓山第一小学");
	school.setCity("福清");
	schooldao.save(school);
}

//分页查询
@Test
public void schoolByPage(){
	Page<School> school = schoolService.findAllByPage(0, 3, "name");
	System.out.println(school);
	Page<School> schools = schooldao.findAll(new PageRequest(0, 8,new Sort(new Order(Direction. DESC,"name"))));

	for (School school2 : schools) {
		System.out.println(school2.getName());
		System.out.println(school2.getClass().getName());
		
	}
	System.out.println("schools:"+schools.getContent());
}

}
