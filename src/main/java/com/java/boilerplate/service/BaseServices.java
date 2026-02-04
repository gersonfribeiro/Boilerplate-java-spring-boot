package com.java.boilerplate.service;

import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;

public abstract class BaseServices<T> {
    protected abstract T findById(int id, String authorization);
    protected abstract ResponsePagination<T> findAll(RequestPagination pagination, String authorization);
    protected abstract T create(T data, String authorization);
    protected abstract T update(T data, int id, String authorization);
    protected abstract String delete(int id, String authorization);
}
