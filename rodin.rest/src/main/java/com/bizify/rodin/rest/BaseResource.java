package com.bizify.rodin.rest;

import java.io.Serializable;

import com.bizify.rodin.rest.interfaces.PageableResultList;
import com.bizify.rodin.rest.interfaces.Result;
import com.bizify.rodin.rest.interfaces.ResultList;

/**
 * Base class for all controller implementations
 */
public abstract class BaseResource {

    public <T extends Serializable> Response<T> newResponse(T data) {
        Response<T> response = new Response<T>();
        response.setData(data);
        return response;
    }

    public static EmptyWSResponse newEmptyResponse() {
        return new EmptyWSResponse();
    }

    protected static class EmptyWSResponse extends Response<String> {
        private static final long serialVersionUID = -8413822735355019561L;
    }

    protected static class EmptyWSResponseList extends ResponseList<String> {
        private static final long serialVersionUID = -8413822735355019562L;
    }

    public static EmptyWSResponseList newEmptyResponseList() {
        return new EmptyWSResponseList();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public <T extends Response> T respond(T response, Result result) {
        if (result != null) {
            response.setData(result.getData());
            response.setMessages(result.getMessages());
        }

        return response;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public <T extends ResponseList> T respondList(T response, ResultList result) {
        response.setData(result.getData());
        response.setMessages(result.getMessages());
        return response;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public <T extends PageableResponseList> T respondPageableList(T response, PageableResultList result) {
        response.setData(result.getData());
        response.setMessages(result.getMessages());
        response.setPage(result.getPage());
        response.setTotalRecords(result.getTotalRecords());
        return response;
    }
}
