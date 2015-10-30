package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

@Entity
@Table(name = "systemrole")
public class SystemRole extends BaseDomain implements Persistence {
    private static final long serialVersionUID = -8716034793299310105L;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public SystemRole() {}

    public SystemRole(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
