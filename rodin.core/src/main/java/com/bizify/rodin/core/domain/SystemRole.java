package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SystemRole")
public class SystemRole extends BaseDomain {
	@Column(name = "Name")
	private String name;

	@Column(name = "Description")
	private String description;

	public SystemRole() {
	}

	public SystemRole(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
