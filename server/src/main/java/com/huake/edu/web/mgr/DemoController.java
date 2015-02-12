package com.huake.edu.web.mgr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class DemoController {
	
	
	
	@RequestMapping(value={"/mgr/demo/aldiv"} ,method=RequestMethod.GET)
public String turnaldiv(){
	
	return  "demo/aldiv";
}
	
	
	

}
