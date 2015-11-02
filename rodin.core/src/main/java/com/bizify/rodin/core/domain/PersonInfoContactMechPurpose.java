package com.bizify.rodin.core.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="PersonInfoContactMechPurpose", uniqueConstraints = {
                                                                 @UniqueConstraint(columnNames = "persanalInfo.id"), 
                                                                 @UniqueConstraint(columnNames = "contactMech.id"), 
                                                                 @UniqueConstraint(columnNames = "contactMechPurposeType.id")})
public class PersonInfoContactMechPurpose extends BaseDomain {
   
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "persanalInfo.id", insertable = false, updatable = false)
    private PersonalInfo personalInfo = null;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "contactMech.id", insertable = false, updatable = false)
    private ContactMech contactMech = null;

    @ManyToOne(cascade =CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "contactMechPurposeType.id", insertable = false, updatable = false)
    private ContactMechPurposeType contactMechPurposeType = null;

    
    
}
