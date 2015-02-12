package com.huake.edu.entity;

import com.huake.base.IdEntity;

/**
 * API访问日志，定期备份，只插入数据，用于统计
 * @author laidingqing
 *
 */
public class ApiLog extends IdEntity {

	/**
	 * 访问路径contextPath
	 */
	private String path;
	
	/**
	 * 创建日期
	 */
	private String crtDate;
	
	//增加其它客户端属性字段
	
	private String remoteIp;
	
	private String system;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getCrtDate() {
		return crtDate;
	}

	public void setCrtDate(String crtDate) {
		this.crtDate = crtDate;
	}

	public String getRemoteIp() {
		return remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}
	
	
}
