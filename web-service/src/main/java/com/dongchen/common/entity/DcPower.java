package com.dongchen.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.dongchen.common.base.FrmData;

@Entity
@Table(name = "dc_power")
public class DcPower extends FrmData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5127535102628775616L;

	@Column(name = "po_name")
	private String poName;

	@Column(name = "po_type")
	private String poType;

	public String getPoName() {
		return poName;
	}

	public void setPoName(String poName) {
		this.poName = poName;
	}

	public String getPoType() {
		return poType;
	}

	public void setPoType(String poType) {
		this.poType = poType;
	}
}
