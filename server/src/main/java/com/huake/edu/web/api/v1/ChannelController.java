package com.huake.edu.web.api.v1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springside.modules.web.MediaTypes;

import com.huake.push.entity.Device;

/**
 * 公共接口。
 * @author laidingqing
 *
 */
@RestController
@RequestMapping(value = "/api/v1/channel")
public class ChannelController {

	/**
	 * 登记设备信息，用于推送
	 * @param device
	 */
	@RequestMapping( value = "/token" ,method = RequestMethod.POST, produces = MediaTypes.JSON_UTF_8)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void token(@RequestBody Device device){
		
	}
	
	/**
	 * 检查版本
	 */
	@RequestMapping( value = "/versions" ,method = RequestMethod.GET, produces = MediaTypes.JSON_UTF_8)
	public void versions(){
		
	}
}
