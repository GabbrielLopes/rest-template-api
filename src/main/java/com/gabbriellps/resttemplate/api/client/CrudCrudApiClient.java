package com.gabbriellps.resttemplate.api.client;

import com.gabbriellps.resttemplate.api.dto.request.VeiculoDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Component
public class CrudCrudApiClient extends AbstractClient {
    protected CrudCrudApiClient(RestTemplate restTemplate) {
        super(restTemplate);
    }

    public List<VeiculoDTO> buscaVeiculos() {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getUriCrudCrudApi())
                .path("/veiculos");

        ParameterizedTypeReference<List<VeiculoDTO>> responseType = new ParameterizedTypeReference<>() {
        };

        return restTemplate.exchange(builder.build().toUriString(), HttpMethod.GET,
                new HttpEntity<>(null), responseType).getBody();
    }

    public void insereVeiculo(VeiculoDTO requestDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getUriCrudCrudApi())
                .path("/veiculos");

        restTemplate.exchange(builder.build().toUriString(), HttpMethod.POST, new HttpEntity<>(requestDTO), Void.class);
    }
}
