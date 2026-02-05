package com.java.boilerplate.repository.users;

import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;
import com.java.boilerplate.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UsersJDBC implements IUsersRepository {

    @Override
    public User findByUsernameOrEmail(String usernameOrEmail, String authorization) {
        return null;
    }

    @Override
    public User findById(int id, String authorization) {
        return null;
    }

    @Override
    public ResponsePagination<User> findAll(RequestPagination pagination, String authorization) {
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
        return null;
    }
}
