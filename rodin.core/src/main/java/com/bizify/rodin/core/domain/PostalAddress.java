package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

@Entity
@Table(name = "PostalAddress")
public class PostalAddress extends BaseDomain implements Persistence {

    @Column
    private String toName;
    @Column
    private String address1;
    @Column
    private String address2;
    @Column
    private String directions;
    @Column
    private String city;
    @Column
    private String postalCode;
    @Column
    private String postalCodeExt;
    @Column(name = "Country_Geo_Id")
    private String countryGeoId;
    @Column(name = "State_Province_Geo_Id")
    private String stateProvinceGeoId;

    @ManyToOne
    @JoinColumn(name = "contactMech.id")
    private ContactMech contactMech;

    @ManyToOne
    @JoinColumns({ @JoinColumn(name = "Country_Geo_Id", referencedColumnName = "Geo_Id"),
                   @JoinColumn(name = "State_Province_Geo_Id", referencedColumnName = "Geo_Id") })
    private Geo geo = null;

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCodeExt() {
        return postalCodeExt;
    }

    public void setPostalCodeExt(String postalCodeExt) {
        this.postalCodeExt = postalCodeExt;
    }

    public String getCountryGeoId() {
        return countryGeoId;
    }

    public void setCountryGeoId(String countryGeoId) {
        this.countryGeoId = countryGeoId;
    }

    public String getStateProvinceGeoId() {
        return stateProvinceGeoId;
    }

    public void setStateProvinceGeoId(String stateProvinceGeoId) {
        this.stateProvinceGeoId = stateProvinceGeoId;
    }
}
