package com.dongchen.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.dongchen.common.base.FrmData;

@Entity
@Table(name = "dc_user")
public class DcUser extends FrmData {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2097137919103544862L;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_rname")
	private String userRname;

	@Column(name = "user_pwd")
	private String userPwd;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRname() {
		return userRname;
	}

	public void setUserRname(String userRname) {
		this.userRname = userRname;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

}
