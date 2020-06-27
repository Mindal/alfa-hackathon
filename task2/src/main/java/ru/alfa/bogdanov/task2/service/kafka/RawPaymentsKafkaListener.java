package ru.alfa.bogdanov.task2.service.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.alfa.bogdanov.task2.model.kafka.RawPayment;
import ru.alfa.bogdanov.task2.repository.RawPaymentRepository;
import ru.alfa.bogdanov.task2.service.WrappedObjectMapper;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class RawPaymentsKafkaListener {

    private final WrappedObjectMapper wrappedObjectMapper;

    private final RawPaymentRepository rawPaymentRepository;

    //    {"ref":"U031706200000001","categoryId":3,"userId":"XA1VWF","recipientId":"XA6F9K","desc":"Платежное поручение №1","amount":4377.14}
    @KafkaListener(topics = "RAW_PAYMENTS")
    public void receiveMessage(String payload) {
        log.debug("Received message {}", payload);
        Optional<RawPayment> optionalRawPayment = wrappedObjectMapper.fromJson(payload, RawPayment.class);
        optionalRawPayment.ifPresent(rawPaymentRepository::save);
    }
}
