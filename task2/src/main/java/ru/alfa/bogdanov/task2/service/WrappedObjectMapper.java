package ru.alfa.bogdanov.task2.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class WrappedObjectMapper {

    private final ObjectMapper objectMapper;

    @SneakyThrows
    public String toJson(Object input) {
        return objectMapper.writeValueAsString(input);
    }

    @SneakyThrows
    public <R> Optional<R> fromJson(String json, Class<R> targetClass) {
        try {
            return Optional.of(objectMapper.readValue(json, targetClass));
        } catch (Exception e) {
            log.error("Couldn't parse json string {} to class {}", json, targetClass.getName(), e);
            return Optional.empty();
        }
    }
}
