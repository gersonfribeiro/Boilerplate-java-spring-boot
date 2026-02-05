package com.java.boilerplate.model;

import lombok.Data;

import java.util.List;

@Data
public class ResponsePagination<T> {
    private Integer limit;
    private Integer offset;
    private Integer total;
    private Boolean hasMore;
    private List<T> itens;
}
