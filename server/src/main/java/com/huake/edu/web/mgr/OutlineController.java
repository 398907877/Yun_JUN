package com.huake.edu.web.mgr;


import java.util.ArrayList;
import java.util.List;











import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.huake.dict.entity.Dictionary;
import com.huake.edu.entity.Outline;
import com.huake.edu.service.outline.OutlineService;

@Controller
@RequestMapping(value = "/mgr/outlines")
public class OutlineController {

	private final static Logger logger = LoggerFactory.getLogger(OutlineController.class);
	
	@Autowired
	OutlineService outlineservice;

	// 显示所有的outline GET

	@RequestMapping(method = RequestMethod.GET)
	public String getAllOutLines(String msg, Model model) {

		logger.debug("outline init list .........");
		
		List<Outline> outlines = new ArrayList<Outline>();

		outlines = outlineservice.getAllOutline();

		model.addAttribute("outlinelist", outlines);
		model.addAttribute("msg", msg);


		return "outline/outlineList";

	
	}

	// 显示所有的outline POST

	@RequestMapping(method = RequestMethod.POST)
	public String getAllOutLines(Model model) {

		List<Outline> outlines = new ArrayList<Outline>();

		outlines = outlineservice.getAllOutline();

		model.addAttribute("outlinelist", outlines);

		return "outline/outlineList";
	}

	// 增加大纲
	@RequestMapping(value = { "addoutline" })
	public String addOutLine( @Validated  Outline outline,BindingResult result,    RedirectAttributes redirectAttributes ) {
		
		
		
		if(result.hasErrors()){
			
			System.out.println("  表单验证没通过  出错了");
			
			
			//怎么把错误信息返回页面显示？？？？？
			
		  
			return "outline/addoutline";
			
		}

		outlineservice.saveOutline(outline);
		System.out.println("新增成功");
		redirectAttributes.addAttribute("msg", "增加大纲成功！");

		return "redirect:/mgr/outlines";

	}

	// outlinelist 增加的跳转

	@RequestMapping(value = { "add" })
	public String turnadd() {

		return "outline/addoutline";
	}

	// -------------------------------------------------------------------------------------------

	// 删除大纲

	@RequestMapping(value = { "delete/{id}" })
	public String deleteOutLine(@PathVariable("id") long id, Model model) {

		outlineservice.deleteOutline(id);

		model.addAttribute("msg", "删除大纲成功！");

		return "redirect:/mgr/outlines";

	}
	
	//修改大纲
	@RequestMapping(value = { "update/{id}" })
	public String updateOutLine( @PathVariable("id") long id, Model model) {
		//1.先查询出改id对应的   outline
		//2.将  outline对象  绑定到页面
		Outline outline=  outlineservice.getOne(id);
		
		
		
		
		
		System.out.println("获取到的ip是"+id);
		model.addAttribute("outline", outline);
		
		return  "outline/updateoutline";
		


	}

	@ModelAttribute("grades")
	public List<Dictionary> findAllGrades(){
		
		return null;
	}
}
