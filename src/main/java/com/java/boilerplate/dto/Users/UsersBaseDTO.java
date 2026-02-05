package com.java.boilerplate.dto.Users;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public record UsersBaseDTO(
        Long idUser,
        String name,
        String username,
        String email,
        String password,
        Boolean showPhoneNumber,
        String phoneNumber,
        List<String>urlImages,
        Boolean online,
        LocalDateTime lastLogin,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Map<Double, Double>lastLocations
) {
}
