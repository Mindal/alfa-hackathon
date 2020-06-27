package ru.alfa.bogdanov.task2.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.alfa.bogdanov.task2.exception.NotFoundException;
import ru.alfa.bogdanov.task2.model.kafka.RawPayment;
import ru.alfa.bogdanov.task2.model.swagger.PaymentCategoryInfo;
import ru.alfa.bogdanov.task2.model.swagger.UserPaymentAnalytic;
import ru.alfa.bogdanov.task2.repository.RawPaymentRepository;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class AnalyticService {

    private final RawPaymentRepository rawPaymentRepository;

    public List<UserPaymentAnalytic> getAll() {
        return rawPaymentRepository.getAllUserIds().stream()
                .map(this::getByUserId)
                .collect(Collectors.toList());
    }

    public UserPaymentAnalytic getByUserId(String id) {
        Collection<RawPayment> rawPayments = rawPaymentRepository.getByUserId(id);
        if (rawPayments.isEmpty()) {
            throw new NotFoundException();
        }

        UserPaymentAnalytic userPaymentAnalytic = new UserPaymentAnalytic();
        userPaymentAnalytic.setUserId(id);
        userPaymentAnalytic.setTotalSum(calculateTotalSum(rawPayments));
        userPaymentAnalytic.setAnalyticInfo(calculateAnalyticInfo(rawPayments));
        return userPaymentAnalytic;
    }

    private Map<Integer, PaymentCategoryInfo> calculateAnalyticInfo(Collection<RawPayment> rawPayments) {
        Map<Integer, PaymentCategoryInfo> result = new HashMap<>();

        Map<Integer, List<RawPayment>> collect = rawPayments.stream().collect(Collectors.groupingBy(RawPayment::getCategoryId));
        for (Map.Entry<Integer, List<RawPayment>> entry : collect.entrySet()) {
            PaymentCategoryInfo paymentCategoryInfo = calculatePaymentCategoryInfo(entry.getValue());
            result.put(entry.getKey(), paymentCategoryInfo);
        }
        return result;
    }

    private PaymentCategoryInfo calculatePaymentCategoryInfo(List<RawPayment> rawPayments) {
        BigDecimal sum = rawPayments.stream().map(RawPayment::getAmount)
                .reduce(BigDecimal::add)
                .orElseThrow(IllegalArgumentException::new);

        BigDecimal max = rawPayments.stream().map(RawPayment::getAmount)
                .max(Comparator.naturalOrder())
                .orElseThrow(IllegalArgumentException::new);

        BigDecimal min = rawPayments.stream().map(RawPayment::getAmount)
                .min(Comparator.naturalOrder())
                .orElseThrow(IllegalArgumentException::new);

        PaymentCategoryInfo paymentCategoryInfo = new PaymentCategoryInfo();
        paymentCategoryInfo.setMax(max);
        paymentCategoryInfo.setMin(min);
        paymentCategoryInfo.setSum(sum);
        return paymentCategoryInfo;
    }

    private BigDecimal calculateTotalSum(Collection<RawPayment> rawPayments) {
        return rawPayments.stream()
                .map(RawPayment::getAmount)
                .reduce(BigDecimal::add)
                .orElseThrow(RuntimeException::new);
    }

}
