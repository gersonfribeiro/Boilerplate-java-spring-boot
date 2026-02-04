package com.java.boilerplate.repository;

import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;
import org.springframework.http.ResponseEntity;

public interface IBaseCRUD<T> {
    ResponseEntity<T> findById(int id, String authorization);
    ResponseEntity<ResponsePagination<T>> findAll(RequestPagination pagination, String authorization);
    ResponseEntity<T> create(T data, String authorization);
    ResponseEntity<T> update(T data, int id, String authorization);
    ResponseEntity<String> delete(int id, String authorization);
}
