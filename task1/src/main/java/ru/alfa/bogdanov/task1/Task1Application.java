package ru.alfa.bogdanov.task1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import ru.alfa.bogdanov.task1.model.api.JSONResponseBankATMDetails;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class Task1Application {

    @Autowired
    private RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Task1Application.class, args);
    }

    @PostConstruct
    public void testApi() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("x-ibm-client-id", "16dc4fe9-1e01-461b-baec-154966309770");

        HttpEntity entity = new HttpEntity(httpHeaders);
        ResponseEntity<JSONResponseBankATMDetails> exchange = restTemplate.exchange("https://apiws.alfabank.ru/alfabank/alfadevportal/atm-service/atms", HttpMethod.GET, entity, JSONResponseBankATMDetails.class);
        log.info("");
    }
}
