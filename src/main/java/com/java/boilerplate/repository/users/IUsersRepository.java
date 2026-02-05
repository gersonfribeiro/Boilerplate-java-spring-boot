package com.java.boilerplate.repository.users;

import com.java.boilerplate.model.User;
import com.java.boilerplate.repository.IBaseRepository;

public interface IUsersRepository extends IBaseRepository<User> {
    User findByUsernameOrEmail(String usernameOrEmail, String authorization);
}
