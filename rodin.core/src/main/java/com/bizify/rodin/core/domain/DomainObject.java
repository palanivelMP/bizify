package com.bizify.rodin.core.domain;

import java.io.Serializable;
import java.util.Date;

public interface DomainObject extends Serializable {
	public String getId();

	public void setId(String id);

	public String getCreatedBy();

	public void setCreatedBy(String createdBy);

	public Date getCreatedDate();

	public void setCreatedDate(Date createdDate);

	public String getModifiedBy();

	public void setModifiedBy(String createdBy);

	public Date getModifiedDate();

	public void setModifiedDate(Date createdDate);

	public boolean getStatus();

	public void setStatus(boolean status);
}
