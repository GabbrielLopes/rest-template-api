package com.gabbriellps.resttemplate.api.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class AbstractClient {

    @Value("spring.via-cep.api.url")
    private String uriViaCep;

    protected final transient RestTemplate restTemplate;

    protected AbstractClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    protected String getUriViaCep(){
        return String.format("%s", uriViaCep);
    }

}
