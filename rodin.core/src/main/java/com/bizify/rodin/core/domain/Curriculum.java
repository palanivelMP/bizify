package com.bizify.rodin.core.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

/**
 * @author Chiro Cadiz
 */

@Entity
@Table(name = "Curriculum")
public class Curriculum extends BaseDomain implements Persistence {

    @NotNull
    @Column(unique = true)
    private String code;

    @Column
    private String name;
    
    @OneToMany
    @JoinTable(name="Curriculum_Subject", 
          joinColumns=@JoinColumn(name="curriculum_id"),
          inverseJoinColumns=@JoinColumn(name="subject_id"))
    private Set<Subject> subjects;

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

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

}
