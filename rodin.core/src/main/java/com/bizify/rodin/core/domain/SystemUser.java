package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SystemUser")
public class SystemUser extends BaseDomain {

	@Column(name = "Username", nullable = false)
	private String username;

	@Column(name = "Password", nullable = false)
	private String password;

	public SystemUser() {
	}

	public SystemUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
