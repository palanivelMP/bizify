package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;

/**
 * @author Chiro Cadiz
 */

@Entity
@Table(name = "Curriculum")
public class Curriculum extends BaseDomain {

	@Column(name = "Code")
	private String code;

	@Column(name = "Name")
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
