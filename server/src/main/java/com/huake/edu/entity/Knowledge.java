package com.huake.edu.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.huake.base.IdEntity;

/**
 * 知识点实体
 * @author laidingqing
 *
 */
@Entity
@Table(name = "edu_knowledges")
public class Knowledge extends IdEntity {
	
	/**
	 * 知识点概括
	 */
	private String title;
	
	/**
	 * 知识点详细
	 */
	private String description;
	
	/**
	 * 创建日期
	 */
	private Date crtDate;
	
	/**
	 * 创建者
	 */
	private Integer crtUser;
	
	private Outline outline;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCrtDate() {
		return crtDate;
	}

	public void setCrtDate(Date crtDate) {
		this.crtDate = crtDate;
	}

	public Integer getCrtUser() {
		return crtUser;
	}

	public void setCrtUser(Integer crtUser) {
		this.crtUser = crtUser;
	}

	@ManyToOne
	@JoinColumn(name = "outline_id")
	public Outline getOutline() {
		return outline;
	}

	public void setOutline(Outline outline) {
		this.outline = outline;
	}
	
	
}
