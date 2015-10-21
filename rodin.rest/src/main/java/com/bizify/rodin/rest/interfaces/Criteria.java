package com.bizify.rodin.rest.interfaces;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface Criteria extends Serializable {

    Optional<List<String>> validate();

}
