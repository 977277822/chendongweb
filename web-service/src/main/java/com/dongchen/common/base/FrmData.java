package com.dongchen.common.base;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class FrmData implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8228844719013434904L;
	
	
	@Id
	@GeneratedValue
	private Integer id;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	
}
