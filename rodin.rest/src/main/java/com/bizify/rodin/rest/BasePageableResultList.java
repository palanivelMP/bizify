package com.bizify.rodin.rest;

import java.io.Serializable;

import com.bizify.rodin.rest.interfaces.PageableResultList;

public abstract class BasePageableResultList<T extends Serializable> extends BaseResultList<T> implements PageableResultList<T> {
    protected Integer totalRecords;
    protected Integer page;

    @Override
    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    @Override
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
