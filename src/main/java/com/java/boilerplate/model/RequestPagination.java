package com.java.boilerplate.model;

import lombok.Data;

import java.util.List;

@Data
public class RequestPagination {
    private int limit;
    private int offset;
    private List<RequestFilters> filters;
}
