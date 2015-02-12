package com.huake.edu.web.mgr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/mgr/exercises")
public class ExerciseController {

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		return "exercises/index";
	}
	
}
