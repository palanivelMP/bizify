package com.bizify.rodin.rest;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.bizify.rodin.rest.interfaces.ResultList;

public abstract class BaseResultList<T extends Serializable> extends MessagesContainer implements ResultList<T> {
    protected List<T> data;
    protected Integer size;

    public void setData(List<T> data) {
        this.data = data;
        this.size = CollectionUtils.size(data);
    }

    @Override
    public List<T> getData() {
        return data;
    }

    @Override
    public Integer getSize() {
        return size;
    }

}
