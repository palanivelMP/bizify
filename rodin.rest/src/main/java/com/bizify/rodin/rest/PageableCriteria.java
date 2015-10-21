package com.bizify.rodin.rest;

public class PageableCriteria extends BaseCriteria {

    private static final long serialVersionUID = 4487101020622863358L;

    private int pageSize;
    private int pageNumber;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getStart() {
        return pageSize * pageNumber - pageSize + 1;
    }

    public int getEnd() {
        return pageSize * pageNumber;
    }
}
