package com.dongchen.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.dongchen.common.base.FrmData;

/**
 * 组织角色
 * 
 * @author lzf
 * @time 2015年8月27日23:00:39
 *
 */
@Entity
@Table(name = "dc_org_role")
public class DcOrgRole extends FrmData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4399673336915911906L;

	// 组织ID
	@Column(name = "org_id")
	private Integer orgId;

	// 角色ID
	@Column(name = "role_id")
	private Integer roleId;

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}
