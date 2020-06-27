package ru.alfa.bogdanov.task1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alfa.bogdanov.task1.model.AtmResponse;
import ru.alfa.bogdanov.task1.service.AtmService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/atms")
public class AtmController {

    private final AtmService atmService;

    @GetMapping("/{id}")
    public ResponseEntity<AtmResponse> getById(@PathVariable Integer id) {
        AtmResponse byId = atmService.getById(id);
        return ResponseEntity.ok(byId);
    }

}
