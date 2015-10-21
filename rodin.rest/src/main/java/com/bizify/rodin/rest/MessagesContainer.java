package com.bizify.rodin.rest;

import java.util.Locale;
import java.util.Optional;

import org.springframework.context.MessageSource;

public class MessagesContainer {
    private final static Locale DEFAULT_LOCALE = Locale.US;

    private Messages messages;
    private MessageSource messageSource;

    public Messages getMessages() {
        if (messages == null) {
            messages = new Messages.Builder().build();
        }
        return messages;
    }

    public void addInfo(String code) {
        getDescription(code).ifPresent((description) -> getMessages().getInfos().add(Message.build(code, description)));
    }

    public boolean hasInfos() {
        return getMessages().hasInfos();
    }

    public void addError(String code) {
        getDescription(code).ifPresent((description) -> getMessages().getErrors().add(Message.build(code, description)));
    }

    public boolean hasErrors() {
        return getMessages().hasErrors();
    }

    public void addWarning(String code) {
        getDescription(code).ifPresent((description) -> getMessages().getWarnings().add(Message.build(code, description)));
    }

    public boolean hasWarnings() {
        return getMessages().hasWarnings();
    }

    private Optional<String> getDescription(String code) {
        if (messageSource != null) {
            return Optional.of(messageSource.getMessage(code, null, DEFAULT_LOCALE));
        }

        return Optional.empty();
    }

    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
