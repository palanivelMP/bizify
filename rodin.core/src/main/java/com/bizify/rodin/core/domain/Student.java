package com.bizify.rodin.core.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

@Entity
@Table(name = "student")
public class Student extends BaseDomain implements Persistence {

    @NotNull
    @Column(unique = true)
    private String studentId;

    @OneToOne
    @JoinColumn(name = "personalinfo_id")
    private PersonalInformation personalInformation;

    @ManyToMany
    @JoinTable(name = "student_guardian", joinColumns = @JoinColumn(name = "student_id") , inverseJoinColumns = @JoinColumn(name = "guardian_id") )
    private Set<Guardian> guardians;

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
