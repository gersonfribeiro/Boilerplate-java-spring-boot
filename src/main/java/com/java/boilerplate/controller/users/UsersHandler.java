package com.java.boilerplate.controller.users;

import com.java.boilerplate.controller.BaseHandlers;
import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;
import com.java.boilerplate.model.User;
import com.java.boilerplate.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UsersHandler extends BaseHandlers<User> {

    private final UsersService userService;

    public UsersHandler(UsersService userService) {
        this.userService = userService;
    }

    protected ResponseEntity<User> findByUsernameOrEmail(String usernameOrEmail, String authorization) {
        return ResponseEntity.ok(userService.findByUsernameOrEmail(usernameOrEmail, authorization));
    }

    @Override
    protected ResponseEntity<User> findById(int idUser, String authorization) {
        return ResponseEntity.ok(userService.findById(idUser, authorization));
    }

    @Override
    protected ResponseEntity<ResponsePagination<User>> findAll(RequestPagination pagination, String authorization) {
        return ResponseEntity.ok(userService.findAll(pagination, authorization));
    }

    @Override
    protected ResponseEntity<User> create(User data, String authorization) {
        return ResponseEntity.ok(userService.create(data, authorization));
    }

    @Override
    protected ResponseEntity<User> update(User data, int idUser, String authorization) {
        return ResponseEntity.ok(userService.update(data, idUser, authorization));
    }

    @Override
    protected ResponseEntity<String> delete(int idUser, String authorization) {
        return ResponseEntity.ok(userService.delete(idUser, authorization));
    }
}
