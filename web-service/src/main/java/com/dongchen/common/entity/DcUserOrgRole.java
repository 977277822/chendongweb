package com.dongchen.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.dongchen.common.base.FrmData;

@Entity
@Table(name = "dc_user_org_role")
public class DcUserOrgRole extends FrmData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3329203128935808773L;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "org_role_id")
	private Integer orgRoleId;

}
