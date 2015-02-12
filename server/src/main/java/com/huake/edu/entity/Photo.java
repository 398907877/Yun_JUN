package com.huake.edu.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.huake.base.IdEntity;

/**
 * 图片实体
 * @author skylai
 *
 */
@Entity
@Table(name = "edu_photos")
public class Photo extends IdEntity {

	/**
	 * 保存路径
	 */
	private String path;
	/**
	 * 文件类型
	 */
	private String fileType;
	/**
	 * 关联编号
	 */
	private Long relId;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public Long getRelId() {
		return relId;
	}
	public void setRelId(Long relId) {
		this.relId = relId;
	}
	
}
