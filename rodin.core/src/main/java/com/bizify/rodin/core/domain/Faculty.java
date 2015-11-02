package com.bizify.rodin.core.domain;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Chiro Cadiz
 */
public class Faculty extends BaseDomain {

	@OneToOne
	@JoinColumn(name = "employee_Id")
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
