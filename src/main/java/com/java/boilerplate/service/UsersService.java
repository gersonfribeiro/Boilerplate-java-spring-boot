package com.java.boilerplate.service;

import com.java.boilerplate.exception.ExceptionSystem;
import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;
import com.java.boilerplate.model.User;
import com.java.boilerplate.repository.users.IUsersRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UsersService extends BaseServices<User> {

    private final IUsersRepository usersRepository;

    public UsersService(IUsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User findByUsernameOrEmail(String usernameOrEmail, String authorization) {
        User user = usersRepository.findByUsernameOrEmail(usernameOrEmail, authorization);
        if (user == null) {
            throw new ExceptionSystem("User not found", HttpStatus.NOT_FOUND);
        } else {
            return user;
        }
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
        return "";
    }
}
