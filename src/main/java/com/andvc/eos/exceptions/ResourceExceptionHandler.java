package com.andvc.eos.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;
import java.util.Objects;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<StandardError> handleRuntimeException(RuntimeException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;

        StandardError err = new StandardError(
                Instant.now(),
                status.value(),
                "Resource not found",
                e.getMessage(),
                request.getRequestURI()
        );

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(org.springframework.web.bind.MethodArgumentNotValidException.class)
    public ResponseEntity<StandardError> handleValidation(org.springframework.web.bind.MethodArgumentNotValidException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST;

        String errorMessage = Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage();

        StandardError err = new StandardError(
                Instant.now(),
                status.value(),
                "Validation Error",
                errorMessage,
                request.getRequestURI()
        );

        return ResponseEntity.status(status).body(err);
    }
}
