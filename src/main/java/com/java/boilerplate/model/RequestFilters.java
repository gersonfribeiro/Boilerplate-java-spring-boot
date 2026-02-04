package com.java.boilerplate.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class RequestFilters {
    private String field;
    private String condition;
    private ArrayList<String> value;
}
