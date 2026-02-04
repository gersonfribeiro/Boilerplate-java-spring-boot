package com.java.boilerplate.repository.users;

import com.java.boilerplate.model.User;
import com.java.boilerplate.repository.IBaseCRUD;
import org.springframework.http.ResponseEntity;

public interface IUsersCRUD extends IBaseCRUD<User> {
    ResponseEntity<User> findByUsernameOrEmail(String usernameOrEmail, String authorization);
}
