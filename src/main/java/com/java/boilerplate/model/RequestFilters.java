package com.java.boilerplate.model;

import lombok.Data;

import java.util.List;

@Data
public class RequestFilters {
    private String field;
    private String condition;
    private List<String> value;
}
