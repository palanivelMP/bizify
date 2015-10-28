package com.bizify.rodin.core;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Vener Guevarra
 */
public interface Persistence extends Serializable {

    String getId();

    void setId(String id);

    String getCreatedBy();

    void setCreatedBy(String id);

    Date getCreationDate();

    void setCreationDate(Date creationDate);

    String getModifiedBy();

    void setModifiedBy(String modifiedBy);

    Date getDateModified();

    void setDateModified(Date dateModified);

    boolean isActive();

    void setActive(boolean active);

}
