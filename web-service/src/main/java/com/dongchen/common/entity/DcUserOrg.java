package com.dongchen.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.dongchen.common.base.FrmData;

@Entity
@Table(name = "dc_user_org")
public class DcUserOrg extends FrmData {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1557138906362181993L;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "org_id")
	private Integer orgId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

}
