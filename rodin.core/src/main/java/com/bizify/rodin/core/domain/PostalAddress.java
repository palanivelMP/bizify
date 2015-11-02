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
@Table(name="PostalAddress")
public class PostalAddress extends BaseDomain {
    
    @Column(name="ToName")
    private String toName;
    @Column(name="Address1")
    private String address1;
    @Column(name="Address2")
    private String address2;
    @Column(name="Directions")
    private String directions;
    @Column(name="City")
    private String city;
    @Column(name="PostalCode")
    private String postalCode;
    @Column(name="PostalCodeExt")
    private String postalCodeExt;
    @Column(name="Country_Geo_Id")
    private String countryGeoId;
    @Column(name="State_Province_Geo_Id")
    private String stateProvinceGeoId;
    
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
    @JoinColumn(name = "contactMech.id", insertable = false, updatable = false)
    private ContactMech contactMech = null;
    
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
    @JoinColumns({ @JoinColumn(name = "Country_Geo_Id", referencedColumnName = "Geo_Id"), @JoinColumn(name = "State_Province_Geo_Id", referencedColumnName = "Geo_Id") })
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
