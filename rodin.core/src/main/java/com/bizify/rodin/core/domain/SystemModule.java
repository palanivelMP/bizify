package com.bizify.rodin.core.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

@Entity
@Table(name = "systemmodule")
public class SystemModule extends BaseDomain implements Persistence {

    private static final long serialVersionUID = -4689975054796455707L;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private String url;

    @OneToOne(cascade = CascadeType.ALL)
    private SystemModule parentSystemModule;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<SystemModule> subSystemModules;

    public SystemModule() {}

    public SystemModule(String name, String description) {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SystemModule getParentSystemModule() {
        return parentSystemModule;
    }

    public void setParentSystemModule(SystemModule parentSystemModule) {
        this.parentSystemModule = parentSystemModule;
    }

    public void setSubSystemModules(Set<SystemModule> subSystemModules) {
        this.subSystemModules = subSystemModules;
    }

    public Set<SystemModule> getSubSystemModules() {
        return subSystemModules;
    }

}
