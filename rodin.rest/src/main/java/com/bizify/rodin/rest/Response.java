package com.bizify.rodin.rest;

import java.io.Serializable;

import com.bizify.rodin.rest.interfaces.Result;
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

    public static <T extends Serializable> Builder<T> builder() {
        return new Builder<T>();
    }

    @SuppressWarnings({ "rawtypes" })
    public static class Builder<T extends Serializable> {
        private Result result;

        public Builder withResult(Result result) {
            this.result = result;
            return this;
        }

        public Response<Serializable> build() {
            Response<Serializable> response = new Response<Serializable>();
            if (result != null) {
                response.setData(result.getData());
                response.setMessages(result.getMessages());
            }

            return response;
        }

    }
}
