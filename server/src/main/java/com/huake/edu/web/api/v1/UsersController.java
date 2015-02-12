package com.huake.edu.web.api.v1;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springside.modules.beanvalidator.BeanValidators;
import org.springside.modules.web.MediaTypes;

import com.huake.edu.entity.Member;
import com.huake.edu.entity.Task;

/**
 * 会员用户接口，包含注册，登录，个人资料等
 * @author laidingqing
 *
 */
@RestController("v1UsersController")
@RequestMapping(value = "/api/v1/users")
public class UsersController {

	@Autowired
	private Validator validator;
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST, produces = MediaTypes.JSON_UTF_8)
	public Member signUp(@RequestBody Member member) {
		return null;
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.POST, produces = MediaTypes.JSON_UTF_8)
	public Member signin(@RequestBody Member member){
		BeanValidators.validateWithException(validator, member);
		return null;
	}
	
	@RequestMapping(value = "/${id}", method = RequestMethod.GET, produces = MediaTypes.JSON_UTF_8)
	public Member profile(@PathVariable("id") Integer id){
		return null;
	}
}
