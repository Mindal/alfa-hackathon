package ru.alfa.bogdanov.task1.config;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.InputStream;
import java.security.KeyStore;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        KeyStore keyStore = KeyStore.getInstance("jks");
        InputStream inputStream = new ClassPathResource("nt-gateway.jks").getInputStream();

        keyStore.load(inputStream, "password".toCharArray());

        SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(new SSLContextBuilder()
                .loadTrustMaterial(null, new TrustSelfSignedStrategy())
                .loadKeyMaterial(keyStore, "password".toCharArray())
                .build());

        HttpClient httpClient = HttpClients.custom().setSSLSocketFactory(socketFactory)
                .setMaxConnTotal(5)
                .setMaxConnPerRoute(5)
                .build();

        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
        requestFactory.setReadTimeout(10000);
        requestFactory.setConnectTimeout(10000);

        restTemplate.setRequestFactory(requestFactory);
        return restTemplate;
    }
}
