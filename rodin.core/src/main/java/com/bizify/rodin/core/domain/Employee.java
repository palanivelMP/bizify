package com.bizify.rodin.core.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Chiro Cadiz
 */

@Entity
@Table(name = "Employee")
public class Employee extends BaseDomain {

	@OneToOne
	private PersonalInfo personalInfo;

	@ManyToOne
	@JoinColumn(name = "department_Id")
	private Department department;

	@Column
	private LocalDate employmentStartDate;

	@Column
	private LocalDate employmentEndDate;

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
