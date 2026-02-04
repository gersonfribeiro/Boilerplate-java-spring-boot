package com.java.boilerplate.controller;

import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;
import org.springframework.http.ResponseEntity;

public abstract class BaseHandlers<T> {
    protected abstract ResponseEntity<T> findById(int id, String authorization);
    protected abstract ResponseEntity<ResponsePagination<T>> findAll(RequestPagination pagination, String authorization);
    protected abstract ResponseEntity<T> create(T data, String authorization);
    protected abstract ResponseEntity<T> update(T data, int id, String authorization);
    protected abstract ResponseEntity<String> delete(int id, String authorization);
}
