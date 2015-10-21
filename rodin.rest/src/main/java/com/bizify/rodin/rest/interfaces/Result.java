package com.bizify.rodin.rest.interfaces;

import java.io.Serializable;

import com.bizify.rodin.rest.Messages;

public interface Result<T extends Serializable> {
    T getData();

    Messages getMessages();
}
