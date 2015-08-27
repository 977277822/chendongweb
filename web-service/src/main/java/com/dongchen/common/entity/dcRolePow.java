package com.dongchen.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.dongchen.common.base.FrmData;

@Entity
@Table(name = "dc_role_pow")
public class dcRolePow extends FrmData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8929262829191750383L;

	@Column(name = "role_id")
	private Integer roleId;

	@Column(name = "pow_id")
	private Integer powId;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPowId() {
		return powId;
	}

	public void setPowId(Integer powId) {
		this.powId = powId;
	}

}
