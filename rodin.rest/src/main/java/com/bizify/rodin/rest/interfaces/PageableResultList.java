package com.bizify.rodin.rest.interfaces;

import java.io.Serializable;

public interface PageableResultList<T extends Serializable> extends ResultList<T> {
    Integer getPage();

    Integer getTotalRecords();
}
