package ru.alfa.bogdanov.task2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.alfa.bogdanov.task2.exception.NotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    private ResponseEntity<String> handleNotFoundException() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"status\":\"user not found\"}");
    }
}
