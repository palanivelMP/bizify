package com.bizify.rodin.core.domain;

public class SystemUserRole extends BaseDomain {
	private SystemUser systemUser;
	private SystemRole systemRole;

	public SystemUserRole() {
	}

	public SystemUserRole(SystemUser systemUser, SystemRole systemRole) {
		this.systemUser = systemUser;
		this.systemRole = systemRole;
	}

	public SystemUser getSystemUser() {
		return systemUser;
	}

	public void setSystemUser(SystemUser systemUser) {
		this.systemUser = systemUser;
	}

	public SystemRole getSystemRole() {
		return systemRole;
	}

	public void setSystemRole(SystemRole systemRole) {
		this.systemRole = systemRole;
	}

}
