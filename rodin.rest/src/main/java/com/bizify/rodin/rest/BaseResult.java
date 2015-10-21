package com.bizify.rodin.rest;

import java.io.Serializable;

import com.bizify.rodin.rest.interfaces.Result;

public abstract class BaseResult<T extends Serializable> extends MessagesContainer implements Result<T> {
    protected T data;

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return data;
    }

}
