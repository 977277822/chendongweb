package com.dongchen.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.dongchen.common.base.FrmData;

@Entity
@Table(name = "dc_role")
public class DcRole extends FrmData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7754658879463867139L;

	@Column(name = "ro_name")
	private String ro_name;

	public String getRo_name() {
		return ro_name;
	}

	public void setRo_name(String ro_name) {
		this.ro_name = ro_name;
	}

}
