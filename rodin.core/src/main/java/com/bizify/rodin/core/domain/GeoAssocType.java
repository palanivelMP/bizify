package com.bizify.rodin.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="GeoAssocType")
public class GeoAssocType  extends BaseDomain{

	@Column(name="Description")
    private String description;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
