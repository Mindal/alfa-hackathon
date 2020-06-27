package ru.alfa.bogdanov.task2.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import ru.alfa.bogdanov.task2.model.kafka.RawPayment;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
@Slf4j
public class InMemoryRawPaymentRepository implements RawPaymentRepository {
    private Map<String, List<RawPayment>> map = new ConcurrentHashMap<>(); //userId -> array payments

    @Override
    public void save(RawPayment rawPayment) {
        List<RawPayment> rawPayments = map.computeIfAbsent(rawPayment.getUserId(), s -> new ArrayList<>());
        rawPayments.add(rawPayment);
    }

    @Override
    public Collection<RawPayment> getByUserId(String userId) {
        return map.getOrDefault(userId, Collections.emptyList());
    }

    @Override
    public Set<String> getAllUserIds() {
        return map.keySet();
    }



}
