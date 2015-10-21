package com.bizify.rodin.rest.interfaces;

import java.io.Serializable;
import java.util.List;

import com.bizify.rodin.rest.Messages;

public interface ResultList<T extends Serializable> {
    List<T> getData();

    Messages getMessages();
    
    Integer getSize();
}
