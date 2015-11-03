package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

@Entity
@Table(name = "ContactMechPurposeType")
public class ContactMechPurposeType extends BaseDomain implements Persistence {

    @NotNull
    @Column(unique = true)
    private String code;

    @Column
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
