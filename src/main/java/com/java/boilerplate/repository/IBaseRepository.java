package com.java.boilerplate.repository;

import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;

public interface IBaseRepository<T> {
    T findById(int id, String authorization);
    ResponsePagination<T> findAll(RequestPagination pagination, String authorization);
    T create(T data, String authorization);
    T update(T data, int id, String authorization);
    String delete(int id, String authorization);
}
