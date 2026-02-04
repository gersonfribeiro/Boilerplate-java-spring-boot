package com.java.boilerplate.repository;

import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;

public interface IBaseJDBC<T> {
    T findById(int id);
    ResponsePagination<T> findAll(RequestPagination pagination);
    Boolean create(T data);
    Boolean update(T data, int id);
    Boolean delete(int id);
}
