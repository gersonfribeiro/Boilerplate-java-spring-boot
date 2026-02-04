package com.java.boilerplate.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ResponsePagination<T> {
    private Integer limit;
    private Integer offset;
    private Integer total;
    private Boolean hasMore;
    private ArrayList<T> itens;
}
