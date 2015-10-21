package com.bizify.rodin.rest;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

public class Message implements Serializable {

    private static final long serialVersionUID = 4221450225419029759L;

    private String code;
    private String description;

    public static Message build(String code, String description) {
        return new Message(code, description);
    }

    private Message(String code, String description) {
        if (StringUtils.isEmpty(description)) {
            this.code = null;
            this.description = code;
        } else {
            this.code = code;
            this.description = description;
        }
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
