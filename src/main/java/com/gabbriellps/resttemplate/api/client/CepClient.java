package com.gabbriellps.resttemplate.api.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class CepClient extends AbstractClient {

    protected CepClient(RestTemplate restTemplate) {
        super(restTemplate);
    }



}
