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
@Table(name = "guardian")
public class Guardian extends BaseDomain {

	@OneToOne
	@JoinColumn(name = "personalinfo_id")
	private PersonalInformation personalInformation;

	public PersonalInformation getPersonalInfo() {
		return personalInformation;
	}

	public void setPersonalInfo(PersonalInformation personalInformation) {
		this.personalInformation = personalInformation;
	}
}
