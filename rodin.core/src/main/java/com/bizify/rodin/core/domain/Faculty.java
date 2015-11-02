package com.bizify.rodin.core.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;

import com.bizify.rodin.core.BaseDomain;

/**
 * @author Chiro Cadiz
 */
@Entity
@Table(name="faculty")
public class Faculty extends BaseDomain {

	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
