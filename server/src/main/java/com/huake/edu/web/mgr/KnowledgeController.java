package com.huake.edu.web.mgr;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huake.edu.entity.Knowledge;


@Controller
@RequestMapping(value={"/mgr/knowledges"})
public class KnowledgeController {
	 //知识点的控制器
	
	
	@RequestMapping(method=RequestMethod.GET)
	public  String knowledgeList(){
		
		return "knowledge/knowledgeList";
	}
	
	
	
	@RequestMapping(value={"addknowledge"}, method=RequestMethod.POST)
	public  String knowledgeadd(Knowledge  knowledge ){
		System.out.println(knowledge.getTitle());
		
		return "knowledge/knowledgeList";
	}
	
	
	
	
	
	

}
