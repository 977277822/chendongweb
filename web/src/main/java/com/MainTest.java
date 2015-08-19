package com;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "test")
public class MainTest implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="id")
	private int id;
	
	@Column(name="uname")
	private String uname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	

}
