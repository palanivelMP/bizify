package com.bizify.rodin.rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Response wrapper for domain objects
 * 
 * @param <T extends Serializable> domain object
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Response<T extends Serializable> extends BaseResult<T> implements Serializable {

    private static final long serialVersionUID = -2352982013219618142L;

    public Status getStatus() {
        if (hasErrors()) {
            return Status.FAILURE;
        }
        return Status.SUCCESS;
    }

    public enum Status {
        SUCCESS, FAILURE
    }
}
