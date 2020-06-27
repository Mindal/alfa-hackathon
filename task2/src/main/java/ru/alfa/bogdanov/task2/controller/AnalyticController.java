package ru.alfa.bogdanov.task2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.alfa.bogdanov.task2.model.swagger.UserPaymentAnalytic;
import ru.alfa.bogdanov.task2.model.swagger.UserPaymentStats;
import ru.alfa.bogdanov.task2.model.swagger.UserTemplate;
import ru.alfa.bogdanov.task2.service.AnalyticService;
import ru.alfa.bogdanov.task2.service.StatsService;
import ru.alfa.bogdanov.task2.service.UserTemplateService;

import java.util.List;

@RestController
@RequestMapping("/analytic")
@RequiredArgsConstructor
public class AnalyticController {

    private final AnalyticService analyticService;
    private final StatsService statsService;
    private final UserTemplateService userTemplateService;

    @GetMapping()
    public List<UserPaymentAnalytic> getAllAnalytic() {
        return analyticService.getAll();
    }

    @GetMapping("/{userId}")
    ResponseEntity<UserPaymentAnalytic> getAnalyticByUserId(@PathVariable("userId") String userId){
        UserPaymentAnalytic byUserId = analyticService.getByUserId(userId);
        return ResponseEntity.ok(byUserId);
    }

    @GetMapping("/{userId}/stats")
    ResponseEntity<UserPaymentStats> getUserStats(@PathVariable("userId") String userId) {
        UserPaymentStats userStats = statsService.getUserStats(userId);
        return ResponseEntity.ok(userStats);
    }

    @GetMapping("/{userId}/templates")
    ResponseEntity<List<UserTemplate>> getUserTemplates(@PathVariable("userId") String userId) {
        List<UserTemplate> userTemplates = userTemplateService.getUserTemplates(userId);
        return ResponseEntity.ok(userTemplates);
    }




}
