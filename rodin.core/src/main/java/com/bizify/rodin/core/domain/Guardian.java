package com.bizify.rodin.core.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

/**
 * @author Chiro Cadiz
 */

@Entity
@Table(name = "guardian")
public class Guardian extends BaseDomain implements Persistence {

    @OneToOne
    @JoinColumn(name = "personalinfo_id")
    private PersonalInformation personalInformation;

    @ManyToMany(mappedBy = "guardians")
    private Set<Student> students;

    public PersonalInformation getPersonalInfo() {
        return personalInformation;
    }

    public void setPersonalInfo(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }
}
