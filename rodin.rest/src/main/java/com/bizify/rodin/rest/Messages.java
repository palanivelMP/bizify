package com.bizify.rodin.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

public class Messages implements Serializable {
    private static final long serialVersionUID = 5830088821806491705L;

    private List<Message> infos;
    private List<Message> errors;
    private List<Message> warnings;

    private Messages(Builder builder) {
        this.infos = builder.infos;
        this.errors = builder.errors;
        this.warnings = builder.warnings;
    }

    public List<Message> getInfos() {
        return infos;
    }

    public List<Message> getErrors() {
        return errors;
    }

    public List<Message> getWarnings() {
        return warnings;
    }

    public boolean hasInfos() {
        return CollectionUtils.isNotEmpty(infos);
    }

    public boolean hasErrors() {
        return CollectionUtils.isNotEmpty(errors);
    }

    public boolean hasWarnings() {
        return CollectionUtils.isNotEmpty(warnings);
    }

    public static class Builder {
        private List<Message> infos = new ArrayList<Message>();
        private List<Message> errors = new ArrayList<Message>();
        private List<Message> warnings = new ArrayList<Message>();

        public Messages build() {
            return new Messages(this);
        }

        public Builder addInfo(Message message) {
            infos.add(message);
            return this;
        }

        public Builder addError(Message message) {
            errors.add(message);
            return this;
        }

        public Builder addWarning(Message message) {
            warnings.add(message);
            return this;
        }

    }

}
