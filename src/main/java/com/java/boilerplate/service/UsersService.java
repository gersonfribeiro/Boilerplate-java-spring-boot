package com.java.boilerplate.service;

import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;
import com.java.boilerplate.model.User;
import org.springframework.stereotype.Service;

@Service
public class UsersService extends BaseServices<User> {

    @Override
    public User findById(int id, String authorization) {
        return null;
    }

    @Override
    public ResponsePagination<User> findAll(RequestPagination pagination, String authorization) {
        return null;
    }

    public User findByUsernameOrEmail(String usernameOrEmail, String authorization) {
        return null;
    }

    @Override
    public User create(User data, String authorization) {
        return null;
    }

    @Override
    public User update(User data, int id, String authorization) {
        return null;
    }

    @Override
    public String delete(int id, String authorization) {
        return "";
    }
}
