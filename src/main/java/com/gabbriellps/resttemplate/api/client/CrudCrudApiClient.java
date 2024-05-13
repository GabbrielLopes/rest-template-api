package com.gabbriellps.resttemplate.api.client;

import com.gabbriellps.resttemplate.api.dto.VeiculoDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class CrudCrudApiClient extends AbstractClient {
    protected CrudCrudApiClient(RestTemplate restTemplate) {
        super(restTemplate);
    }


    public void insereVeiculo(VeiculoDTO requestDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getUriCrudCrudApi())
                .path("/veiculos");

        restTemplate.exchange(builder.build().toUriString(), HttpMethod.POST, new HttpEntity<>(requestDTO), Void.class);
    }
}
