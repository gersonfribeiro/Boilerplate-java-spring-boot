package com.java.boilerplate.repository.users;

import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;
import com.java.boilerplate.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UsersJDBC implements IUsersJDBC {
    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public ResponsePagination<User> findAll(RequestPagination pagination) {
        return null;
    }

    @Override
    public Boolean create(User data) {
        return null;
    }

    @Override
    public Boolean update(User data, int id) {
        return null;
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }

    @Override
    public User findByUsernameOrEmail(String usernameOrEmail) {
        return null;
    }
}
