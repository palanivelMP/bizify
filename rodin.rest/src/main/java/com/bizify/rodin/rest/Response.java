package com.bizify.rodin.rest;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Response wrapper for domain objects
 * 
 * @param <T extends Serializable> domain object
 */
@JsonRootName("response")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response<T extends Serializable> extends BaseResult<T> implements Serializable {

    private static final long serialVersionUID = -2352982013219618142L;

    public String getStatus() {
        if (hasErrors()) {
            return Status.FAILURE.toString();
        }
        return Status.SUCCESS.toString();
    }

    public enum Status {

        SUCCESS("success"), FAILURE("failure");

        private String value;

        private Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }
}
