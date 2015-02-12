package com.huake.edu.service.outline;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;




import com.huake.edu.entity.Outline;
import com.huake.edu.repository.OutlineDao;

@Component
@Transactional
public class OutlineService {
	
	private  OutlineDao  outlineDao;


	
	
	@Autowired
	public void setOutlineDao(OutlineDao outlineDao) {
		this.outlineDao = outlineDao;
	}
//保存大纲
	public  void saveOutline(Outline outline){
		outlineDao.save(outline);
		
	}
//删除大纲
	public void deleteOutline(long id  ){
		outlineDao.delete(id);
		
	}
//修改大纲
	
//查询大纲   一条
	public Outline  getOne (long id ){
		
		return outlineDao.findOne(id);
	}

//查询大纲  多条
	
  public  List<Outline> getAllOutline(){
	
	  return 	  (List<Outline>) outlineDao.findAll();
	  
  }	
	
	

	
	

}
