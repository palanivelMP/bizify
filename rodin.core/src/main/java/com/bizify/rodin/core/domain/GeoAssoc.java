package com.bizify.rodin.core.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GeoAssoc")
public class GeoAssoc extends BaseDomain {

    @Column(name = "GeoIdTo")
    private String geoIdTo;
    @Column(name = "Geo_Assoc_Type_Id")
    private String geoAssocTypeId;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
    @JoinColumns({ @JoinColumn(name = "geo.id", referencedColumnName = "Geo_Id"), @JoinColumn(name = "GeoIdTo", referencedColumnName = "Geo_Id") })
    private Geo geo = null;

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public GeoAssocType getGeoAssocType() {
        return geoAssocType;
    }

    public void setGeoAssocType(GeoAssocType geoAssocType) {
        this.geoAssocType = geoAssocType;
    }

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
    @JoinColumn(name = "geoAssocType.id", insertable = false, updatable = false)
    private GeoAssocType geoAssocType = null;


    public String getGeoIdTo() {
        return geoIdTo;
    }

    public void setGeoIdTo(String geoIdTo) {
        this.geoIdTo = geoIdTo;
    }

    public String getGeoAssocTypeId() {
        return geoAssocTypeId;
    }

    public void setGeoAssocTypeId(String geoAssocTypeId) {
        this.geoAssocTypeId = geoAssocTypeId;
    }
}
