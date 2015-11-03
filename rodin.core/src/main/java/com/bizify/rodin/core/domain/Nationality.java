package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

/**
 * @author Chiro Cadiz
 */

@Entity
@Table(name = "nationality")
public class Nationality extends BaseDomain implements Persistence {

    @Column
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
