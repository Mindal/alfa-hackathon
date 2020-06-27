package ru.alfa.bogdanov.task2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.alfa.bogdanov.task2.exception.NotFoundException;
import ru.alfa.bogdanov.task2.model.kafka.RawPayment;
import ru.alfa.bogdanov.task2.model.swagger.UserTemplate;
import ru.alfa.bogdanov.task2.repository.RawPaymentRepository;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserTemplateService {
    private final RawPaymentRepository rawPaymentRepository;

    public List<UserTemplate> getUserTemplates(String userId) {
        Collection<RawPayment> rawPayments = rawPaymentRepository.getByUserId(userId);
        if (rawPayments.isEmpty()) {
            throw new NotFoundException();
        }

        Map<UserTemplate, Long> groupByRawPayment = rawPayments.stream()
                .collect(Collectors.groupingBy(this::createUserTemplate, Collectors.counting()));

        return groupByRawPayment.entrySet().stream()
                .filter(e -> e.getValue() >= 3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private UserTemplate createUserTemplate(RawPayment rawPayment) {
        UserTemplate userTemplate = new UserTemplate();
        userTemplate.setAmount(rawPayment.getAmount());
        userTemplate.setCategoryId(rawPayment.getCategoryId());
        userTemplate.setRecipientId(rawPayment.getRecipientId());
        return userTemplate;
    }

}
