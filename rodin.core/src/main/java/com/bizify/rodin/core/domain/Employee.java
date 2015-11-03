package com.bizify.rodin.core.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

/**
 * @author Chiro Cadiz
 */

@Entity
@Table(name = "Employee")
public class Employee extends BaseDomain implements Persistence {

    @OneToOne
    @JoinColumn(name = "personalinformation_id")
    private PersonalInformation personalInformation;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column
    private LocalDate employmentStartDate;

    @Column
    private LocalDate employmentEndDate;

    public PersonalInformation getPersonalInfo() {
        return personalInformation;
    }

    public void setPersonalInfo(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
