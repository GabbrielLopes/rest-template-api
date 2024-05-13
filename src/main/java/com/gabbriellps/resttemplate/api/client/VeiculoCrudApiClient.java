package com.gabbriellps.resttemplate.api.client;

import com.gabbriellps.resttemplate.api.dto.request.VeiculoRequestDTO;
import com.gabbriellps.resttemplate.api.dto.response.VeiculoResponseDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Component
public class VeiculoCrudApiClient extends AbstractClient {
    protected VeiculoCrudApiClient(RestTemplate restTemplate) {
        super(restTemplate);
    }

    public List<VeiculoResponseDTO> buscaVeiculos() {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getUriCrudCrudApi())
                .path("/veiculos");

        ParameterizedTypeReference<List<VeiculoResponseDTO>> responseType = new ParameterizedTypeReference<>() {
        };

        return restTemplate.exchange(builder.build().toUriString(), HttpMethod.GET,
                new HttpEntity<>(null), responseType).getBody();
    }

    public VeiculoResponseDTO buscaVeiculo(String id) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getUriCrudCrudApi())
                .path("/veiculos/{id}");

        return restTemplate.exchange(builder.buildAndExpand(id).toUriString(), HttpMethod.GET,
                new HttpEntity<>(null), VeiculoResponseDTO.class).getBody();
    }

    public void insereVeiculo(VeiculoRequestDTO requestDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getUriCrudCrudApi())
                .path("/veiculos");

        restTemplate.exchange(builder.build().toUriString(), HttpMethod.POST, new HttpEntity<>(requestDTO), Void.class);
    }


    public void editaVeiculo(String id, VeiculoRequestDTO requestDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getUriCrudCrudApi())
                .path("/veiculos/{id}");

        restTemplate.exchange(builder.buildAndExpand(id).toUriString(),
                HttpMethod.PUT, new HttpEntity<>(requestDTO), Void.class);
    }

    public void deletaVeiculo(String id) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getUriCrudCrudApi())
                .path("/veiculos/{id}");

        restTemplate.exchange(builder.buildAndExpand(id).toUriString(),
                HttpMethod.DELETE, new HttpEntity<>(null), Void.class);
    }

}
