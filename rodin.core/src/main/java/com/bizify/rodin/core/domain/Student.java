package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;

@Entity
@Table(name = "student")
public class Student extends BaseDomain {

    @Column
    private String studentId;

    @OneToOne
    @JoinColumn(name = "PersonalInfo_Id")
    private PersonalInformation personalInformation;

    public PersonalInformation getPersonalInfo() {
        return personalInformation;
    }

    public void setPersonalInfo(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}
