package com.bizify.rodin.core.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contactMech")
public class ContactMech extends BaseDomain {

    @Column(name = "InfoString")
    private String infoString;
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
    @JoinColumn(name = "contactMechType.id", insertable = false, updatable = false)
    private ContactMechType contactMechType = null;



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
