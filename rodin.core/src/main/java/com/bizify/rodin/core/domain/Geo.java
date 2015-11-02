package com.bizify.rodin.core.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Geo")
public class Geo extends BaseDomain {


    @Column(name = "Geo_Type_Id")
    private String geoTypeId;
    @Column(name = "GeoName")
    private String geoName;
    @Column(name = "GeoCode")
    private String geoCode;
    @Column(name = "GeoSecCode")
    private String geoSecCode;
    @Column(name = "Abbreviation")
    private String abbreviation;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
    @JoinColumn(name = "geoType.id", insertable = false, updatable = false)
    private GeoType geoType = null;

    public GeoType getGeoType() {
        return geoType;
    }

    public void setGeoType(GeoType geoType) {
        this.geoType = geoType;
    }


    public String getGeoTypeId() {
        return geoTypeId;
    }

    public void setGeoTypeId(String geoTypeId) {
        this.geoTypeId = geoTypeId;
    }

    public String getGeoName() {
        return geoName;
    }

    public void setGeoName(String geoName) {
        this.geoName = geoName;
    }

    public String getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }

    public String getGeoSecCode() {
        return geoSecCode;
    }

    public void setGeoSecCode(String geoSecCode) {
        this.geoSecCode = geoSecCode;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

}
