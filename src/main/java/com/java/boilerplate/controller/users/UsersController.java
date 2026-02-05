package com.java.boilerplate.controller.users;

import com.java.boilerplate.model.RequestPagination;
import com.java.boilerplate.model.ResponsePagination;
import com.java.boilerplate.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsersController {

    private final UsersHandler userHandler;

    public UsersController(UsersHandler userHandler) {
        this.userHandler = userHandler;
    }

    @GetMapping("/{usernameOrEmail}")
    public ResponseEntity<User> findByUsernameOrEmail(
            @PathVariable String usernameOrEmail,
            @RequestHeader("Authorization") String authorization
    ) { return userHandler.findByUsernameOrEmail(usernameOrEmail, authorization); }

    @GetMapping("/find/{idUser}")
    public ResponseEntity<User> findById(
            @PathVariable int idUser,
            @RequestHeader("Authorization") String authorization
    ) { return userHandler.findById(idUser, authorization); }

    @GetMapping("/query")
    public ResponseEntity<ResponsePagination<User>> findAll(
            @RequestBody RequestPagination pagination,
            @RequestHeader("Authorization") String authorization
    ) { return userHandler.findAll(pagination, authorization); }

    @PostMapping
    public ResponseEntity<User> create(
            @RequestBody User data,
            @RequestHeader("Authorization") String authorization
    ) { return userHandler.create(data, authorization); }

    @PutMapping("/{idUser}")
    public ResponseEntity<User> update(
            @RequestBody User data,
            @PathVariable int idUser,
            @RequestHeader("Authorization") String authorization
    ) { return userHandler.update(data, idUser, authorization); }

    @DeleteMapping("/{idUser}")
    public ResponseEntity<String> delete(
            @PathVariable int idUser,
            @RequestHeader("Authorization") String authorization
    ) { return userHandler.delete(idUser, authorization); }
}
