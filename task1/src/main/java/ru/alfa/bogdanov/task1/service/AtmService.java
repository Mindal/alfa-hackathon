package ru.alfa.bogdanov.task1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.alfa.bogdanov.task1.exception.NotFoundException;
import ru.alfa.bogdanov.task1.model.AtmResponse;
import ru.alfa.bogdanov.task1.model.api.ATMDetails;
import ru.alfa.bogdanov.task1.model.api.BankATMDetails;
import ru.alfa.bogdanov.task1.model.api.JSONResponseBankATMDetails;
import ru.alfa.bogdanov.task1.model.api.PostAddress;

import javax.validation.Valid;
import java.util.Collections;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AtmService {

    private final RestTemplate restTemplate;

    public AtmResponse getById(Integer id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("x-ibm-client-id", "16dc4fe9-1e01-461b-baec-154966309770");

        HttpEntity entity = new HttpEntity(httpHeaders);
        ResponseEntity<JSONResponseBankATMDetails> response = restTemplate.exchange("https://apiws.alfabank.ru/alfabank/alfadevportal/atm-service/atms", HttpMethod.GET, entity, JSONResponseBankATMDetails.class);

        JSONResponseBankATMDetails body = response.getBody();
        ATMDetails atmDetails = Optional.ofNullable(body)
                .map(JSONResponseBankATMDetails::getData)
                .map(BankATMDetails::getAtms)
                .orElse(Collections.emptyList())
                .stream()
                .filter(ad -> ad.getDeviceId().equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);

        AtmResponse atmResponse = new AtmResponse();

        PostAddress address = atmDetails.getAddress();
        atmResponse.setCity(address.getCity());
        atmResponse.setDeviceId(id);
        atmResponse.setLocation(address.getLocation());

        String payments = atmDetails.getServices().getPayments();
        atmResponse.setPayments("Y".equals(payments));
        atmResponse.setLatitude(atmDetails.getCoordinates().getLatitude());
        atmResponse.setLongitude(atmDetails.getCoordinates().getLongitude());
        return atmResponse;
    }
}
