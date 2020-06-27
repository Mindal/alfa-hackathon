package ru.alfa.bogdanov.task2.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.alfa.bogdanov.task2.exception.NotFoundException;
import ru.alfa.bogdanov.task2.model.kafka.RawPayment;
import ru.alfa.bogdanov.task2.model.swagger.UserPaymentStats;
import ru.alfa.bogdanov.task2.repository.RawPaymentRepository;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class StatsService {
    private final RawPaymentRepository rawPaymentRepository;

    public UserPaymentStats getUserStats(String userId) {
        Collection<RawPayment> rawPayments = rawPaymentRepository.getByUserId(userId);
        if (rawPayments.isEmpty()) {
            throw new NotFoundException();
        }

        UserPaymentStats userPaymentStats = new UserPaymentStats();
        initOftenAndRareCategories(rawPayments, userPaymentStats);
        initMinAndMaxAmountCategoryId(rawPayments, userPaymentStats);
        return userPaymentStats;

    }

    private void initMinAndMaxAmountCategoryId(Collection<RawPayment> rawPayments, UserPaymentStats userPaymentStats) {
        Map<Integer, List<RawPayment>> collect = rawPayments.stream()
                .collect(Collectors.groupingBy(RawPayment::getCategoryId));

        Map<Integer, BigDecimal> sumAmountByCategoryId = new HashMap<>();
        for (Map.Entry<Integer, List<RawPayment>> entry : collect.entrySet()) {
            BigDecimal current = entry.getValue().stream()
                    .map(RawPayment::getAmount)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            sumAmountByCategoryId.put(entry.getKey(), current);
        }

        Integer maxAmountCategoryId = Collections.max(sumAmountByCategoryId.entrySet(), Map.Entry.comparingByValue()).getKey();
        Integer minAmountCategoryId = Collections.min(sumAmountByCategoryId.entrySet(), Map.Entry.comparingByValue()).getKey();

        userPaymentStats.setMinAmountCategoryId(minAmountCategoryId);
        userPaymentStats.setMaxAmountCategoryId(maxAmountCategoryId);
    }

    private void initOftenAndRareCategories(Collection<RawPayment> rawPayments, UserPaymentStats userPaymentStats) {
        Map<Integer, Long> countCategoriesMap = rawPayments.stream()
                .collect(Collectors.groupingBy(RawPayment::getCategoryId, Collectors.counting()));

        Integer oftenCategoryId = Collections.max(countCategoriesMap.entrySet(), Comparator.comparingLong(Map.Entry::getValue)).getKey();
        Integer rareCategoryId = Collections.min(countCategoriesMap.entrySet(), Comparator.comparingLong(Map.Entry::getValue)).getKey();

        userPaymentStats.setOftenCategoryId(oftenCategoryId);
        userPaymentStats.setRareCategoryId(rareCategoryId);
    }


}
