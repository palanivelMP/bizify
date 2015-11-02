package com.bizify.rodin.core.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;

/**
 * @author Chiro Cadiz
 */

@Entity
@Table(name = "Guardian")
public class Guardian extends BaseDomain {

	@OneToOne
	@JoinColumn(name = "personalInfo_Id")
	private PersonalInfo personalInfo;

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
}
