package com.huake.edu.web.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springside.modules.web.Servlets;

import com.google.common.collect.Maps;
import com.huake.edu.entity.School;
import com.huake.edu.entity.Task;
import com.huake.edu.service.account.ShiroDbRealm.ShiroUser;
import com.huake.edu.service.school.SchoolService;
import com.huake.edu.service.task.TaskService;

/**
 * 学校管理
 * @author laidingqing
 *
 */
@Controller
@RequestMapping(value = "/mgr/schools")
public class SchoolsController {
	
	private static final String PAGE_SIZE = "3";

	private static Map<String, String> sortTypes = Maps.newLinkedHashMap();
	static {
		sortTypes.put("auto", "自动");
		sortTypes.put("title", "标题");
	}
	
	@Autowired
	private SchoolService schoolService;

	/**
	 * @param model
	 * @return
	 */
//	@RequestMapping(method = RequestMethod.GET)
//	public String list(Model model) {
//		int page = 0;
//		int size = 5;
//		String sortName = "name";
//		Page<School> schools = schoolService.findAllByPage(page, size, "name");	
//		List<School>  schoolsss = new ArrayList<School>();			
//				for (School school : schools) {
//					schoolsss.add(school);	
//				}
////		List<School> schools = schoolService.getAllSchool();
//		model.addAttribute("schools", schoolsss);
//		return "school/schoolList";
//	}
	@RequestMapping(method = RequestMethod.GET)
	public String list(@RequestParam(value = "page", defaultValue = "1") int pageNumber,
			@RequestParam(value = "page.size", defaultValue = PAGE_SIZE) int pageSize,
			@RequestParam(value = "sortType", defaultValue = "auto") String sortType, Model model,
			ServletRequest request) {
		Map<String, Object> searchParams = Servlets.getParametersStartingWith(request, "search_");
		Page<School> schools = schoolService.getSchool(pageNumber, pageSize, sortType);

		model.addAttribute("schools", schools);
		model.addAttribute("sortType", sortType);
		model.addAttribute("sortTypes", sortTypes);
		// 将搜索条件编码成字符串，用于排序，分页的URL
		model.addAttribute("searchParams", Servlets.encodeParameterStringWithPrefix(searchParams, "search_"));

		return "school/schoolList";
	}

	
	@RequestMapping(value = "schoolAdd",method = RequestMethod.GET)
	public String schoolAdd() {
		return "school/schoolAdd";
	}
	
	@RequestMapping( value={"schoolUpdate/{id}"} , method = RequestMethod.GET)
	public String SchoolUpdate(@PathVariable("id") Long id ,Model model ) {
		School school = schoolService.getSchool(id);
		model.addAttribute("school", school);		
		return "school/schoolUpdate";
	}
	
	@RequestMapping( value={"/schoolView/{id}"} , method = RequestMethod.GET)
	public String schoolView(@PathVariable("id") Long id ,Model model ) {
		School school = schoolService.getSchool(id);
		model.addAttribute("school", school);		
		return "school/schoolView";
	}
	
	@RequestMapping(value="update", method = RequestMethod.POST)
	public String update(@ModelAttribute("school") School school, RedirectAttributes redirectAttributes) {
		schoolService.deleteSchool(school.getId());
		schoolService.updateSchool(school);
		redirectAttributes.addFlashAttribute("message", "更新学校" + school.getName() + "成功");
		return "redirect:/mgr/schools";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(@Valid @ModelAttribute("school") School school, RedirectAttributes redirectAttributes) {
		schoolService.updateSchool(school);
		redirectAttributes.addFlashAttribute("message", "增加学校" + school.getName() + "成功");
		return "redirect:/mgr/schools";
	}

	@RequestMapping(value = "delete/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		School school = schoolService.getSchool(id);
		schoolService.deleteSchool(id);
		redirectAttributes.addFlashAttribute("message", "删除学校" + school.getName() + "成功");
		return "redirect:/mgr/schools";
	}

	/**
	 * 所有RequestMapping方法调用前的Model准备方法, 实现Struts2 Preparable二次部分绑定的效果,先根据form的id从数据库查出User对象,再把Form提交的内容绑定到该对象上。
	 * 因为仅update()方法的form中有id属性，因此仅在update时实际执行.
	 */
	@ModelAttribute
	public void getSchool(@RequestParam(value = "id", defaultValue = "-1") Long id, Model model) {
		if (id != -1) {
			model.addAttribute("school", schoolService.getSchool(id));
		}
	}
	
	/**
	 * Ajax请求校验name是否唯一。
	 */
	@RequestMapping(value = "checkName")
	@ResponseBody
	public String checkName(@RequestParam("name") String name) {
		if (schoolService.findSchoolByName(name) == null) {
			return "true";
		} else {
			return "false";
		}
	}
	
}
