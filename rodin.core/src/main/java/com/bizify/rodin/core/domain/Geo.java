package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

@Entity
@Table(name = "Geo")
public class Geo extends BaseDomain implements Persistence {

    @Column
    private String geoName;
    @Column
    private String geoCode;
    @Column
    private String geoSecCode;
    @Column
    private String abbreviation;

    @ManyToOne
    @JoinColumn(name = "geoType_id")
    private GeoType geoType;

    public GeoType getGeoType() {
        return geoType;
    }

    public void setGeoType(GeoType geoType) {
        this.geoType = geoType;
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
