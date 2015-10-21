package com.bizify.rodin.rest;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import com.bizify.rodin.rest.interfaces.Criteria;

public abstract class BaseCriteria implements Criteria {
    private static final long serialVersionUID = 4302298855862616581L;

    private final static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @Override
    public Optional<List<String>> validate() {
        Set<ConstraintViolation<BaseCriteria>> constraintViolations = validator.validate(this);

        if (constraintViolations.size() > 0) {
            return Optional.of(constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList()));
        }

        return Optional.empty();
    }
}
