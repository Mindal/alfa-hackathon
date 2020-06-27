package ru.alfa.bogdanov.task2.model.kafka;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RawPayment {
    //    {"ref":"U031706200000001","categoryId":3,"userId":"XA1VWF","recipientId":"XA6F9K","desc":"Платежное поручение №1","amount":4377.14}
    private String ref;
    private Integer categoryId;
    private String userId;
    private String recipientId;
    private String desc;
    private BigDecimal amount;
}
