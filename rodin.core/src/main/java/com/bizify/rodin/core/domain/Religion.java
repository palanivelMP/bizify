package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

/**
 * @author Chiro Cadiz
 */

@Entity
@Table(name = "religion")
public class Religion extends BaseDomain implements Persistence {

    @NotNull
    @Column(unique = true)
    private String code;

    @Column
    private String name;

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

}
