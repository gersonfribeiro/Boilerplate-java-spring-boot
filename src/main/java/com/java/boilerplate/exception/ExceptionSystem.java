package com.java.boilerplate.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class ExceptionSystem extends RuntimeException {
    private String message;
    private HttpStatus status;
    private LocalDateTime timestamp;

    public ExceptionSystem(String message) {
        super(message);
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public ExceptionSystem(String message, HttpStatus status) {
        super(message);
        this.message = message;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }
}
