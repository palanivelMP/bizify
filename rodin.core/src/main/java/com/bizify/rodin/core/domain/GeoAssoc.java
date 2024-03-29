package com.bizify.rodin.core.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

@Entity
@Table(name = "GeoAssoc")
public class GeoAssoc extends BaseDomain implements Persistence {

    @Column
    private String geoIdTo;
    @Column
    private String geoAssocTypeId;

    @ManyToOne
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
