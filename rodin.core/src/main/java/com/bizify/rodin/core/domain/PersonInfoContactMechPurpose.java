package com.bizify.rodin.core.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

@Entity
@Table(name = "PersonInfoContactMechPurpose", uniqueConstraints = { @UniqueConstraint(columnNames = "personalInformation.id"),
                                                                    @UniqueConstraint(columnNames = "contactMech.id"),
                                                                    @UniqueConstraint(columnNames = "contactMechPurposeType.id") })
public class PersonInfoContactMechPurpose extends BaseDomain implements Persistence {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personalInformation_id")
    private PersonalInformation personalInformation;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contactMech_id")
    private ContactMech contactMech;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contactMechPurposeType_id")
    private ContactMechPurposeType contactMechPurposeType;

}
