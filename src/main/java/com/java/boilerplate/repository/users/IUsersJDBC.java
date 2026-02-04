package com.java.boilerplate.repository.users;

import com.java.boilerplate.model.User;
import com.java.boilerplate.repository.IBaseJDBC;

public interface IUsersJDBC extends IBaseJDBC<User> {
    User findByUsernameOrEmail(String usernameOrEmail);
}
