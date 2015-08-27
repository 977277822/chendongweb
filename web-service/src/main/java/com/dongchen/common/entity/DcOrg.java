package com.dongchen.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.dongchen.common.base.FrmData;

/**
 * 组织
 * 
 * @author lzf
 * @time 2015年8月27日22:35:37
 *
 */
@Entity
@Table(name = "dc_org")
public class DcOrg extends FrmData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2087218312293833483L;

	// 组织名称
	@Column(name = "oz_name")
	private String ozName;

	// 组织描述
	@Column(name = "oz_desc")
	private String ozDesc;

	// 创始人ID
	@Column(name = "oz_founder")
	private Integer ozFounder;

	// 父组织ID
	@Column(name = "oz_pid")
	private Integer ozPid;

	public String getOzName() {
		return ozName;
	}

	public void setOzName(String ozName) {
		this.ozName = ozName;
	}

	public String getOzDesc() {
		return ozDesc;
	}

	public void setOzDesc(String ozDesc) {
		this.ozDesc = ozDesc;
	}

	public Integer getOzFounder() {
		return ozFounder;
	}

	public void setOzFounder(Integer ozFounder) {
		this.ozFounder = ozFounder;
	}

	public Integer getOzPid() {
		return ozPid;
	}

	public void setOzPid(Integer ozPid) {
		this.ozPid = ozPid;
	}

}
