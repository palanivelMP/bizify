package com.bizify.rodin.core.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

/**
 * @author Chiro Cadiz
 */

@Entity
@Table(name = "grade_level")
public class GradeLevel extends BaseDomain implements Persistence {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "gradeLevel", cascade = CascadeType.ALL)
    private Set<Section> sections;

    public Set<Section> getSections() {
        return sections;
    }

    public void setSections(Set<Section> sections) {
        this.sections = sections;
    }

}
