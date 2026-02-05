package com.java.boilerplate.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Data
public class User {
    private Long idUser;
    private String name;
    private String username;
    private String email;
    private String password;
    private Boolean showPhoneNumber;
    private String phoneNumber;
    private List<String> urlImages;
    private Boolean online;
    private LocalDateTime lastLogin;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Map<Double, Double> lastLocations;
}
