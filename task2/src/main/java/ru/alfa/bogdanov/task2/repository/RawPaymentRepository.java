package ru.alfa.bogdanov.task2.repository;

import ru.alfa.bogdanov.task2.model.kafka.RawPayment;

import java.util.Collection;
import java.util.Set;

public interface RawPaymentRepository {
    void save(RawPayment rawPayment);

    Collection<RawPayment> getByUserId(String userId);

    Set<String> getAllUserIds();
}
