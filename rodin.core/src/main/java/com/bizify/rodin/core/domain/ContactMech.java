package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.bizify.rodin.core.BaseDomain;

@Entity
@Table(name = "ContactMech")
public class ContactMech extends BaseDomain {

    @NotNull
    @Column(unique = true)
    private String contactMechId;

    @Column
    private String infoString;

    @ManyToOne
    @JoinColumn(name = "contactMechType_id")
    private ContactMechType contactMechType;

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getInfoString() {
        return infoString;
    }

    public void setInfoString(String infoString) {
        this.infoString = infoString;
    }

    public ContactMechType getContactMechType() {
        return contactMechType;
    }

    public void setContactMechType(ContactMechType contactMechType) {
        this.contactMechType = contactMechType;
    }

}
