package com.java.boilerplate.controller;

import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;
import org.springframework.http.ResponseEntity;

public abstract class BaseControllers<T> {
    protected abstract ResponseEntity<T> findById(int id);
    protected abstract ResponseEntity<ResponsePagination<T>> findAll(RequestPagination pagination, String authorization);
    protected abstract ResponseEntity<T> create(T data);
    protected abstract ResponseEntity<T> update(T data, int id);
    protected abstract ResponseEntity<String> delete(int id);
}
