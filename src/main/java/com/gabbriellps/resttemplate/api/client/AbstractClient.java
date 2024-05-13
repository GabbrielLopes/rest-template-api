package com.gabbriellps.resttemplate.api.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class AbstractClient {

    @Value("${spring.via-cep.api.url}")
    private String uriViaCep;

    @Value("${spring.brasil-api.api.url}")
    private String uriBrasilApi;

    @Value("${spring.crudcrud-api.api.url}")
    private String uriCrudCrudApi;

    protected final transient RestTemplate restTemplate;

    protected AbstractClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    protected String getUriViaCep(){
        return String.format("%s", uriViaCep);
    }

    protected String getUriBrasilApi(){
        return String.format("%s", uriBrasilApi);
    }

    protected String getUriCrudCrudApi(){
        return String.format("%s", uriCrudCrudApi);
    }

}
