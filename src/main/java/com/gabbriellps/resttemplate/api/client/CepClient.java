package com.gabbriellps.resttemplate.api.client;

import com.gabbriellps.resttemplate.api.dto.response.CepBrasilApiResponseDTO;
import com.gabbriellps.resttemplate.api.dto.response.ViaCepResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@Slf4j
public class CepClient extends AbstractClient {

    protected CepClient(RestTemplate restTemplate) {
        super(restTemplate);
    }


    public ViaCepResponseDTO buscaViaCep(String cep) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getUriViaCep())
                .path("/ws/{cep}/json/");

        ViaCepResponseDTO response = restTemplate.getForObject(builder.buildAndExpand(cep).toUriString(), ViaCepResponseDTO.class);

        return response;
    }

    public CepBrasilApiResponseDTO buscaBrasilApi(String cep) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getUriBrasilApi())
                .path("/cep/v1/{cep}");

        ResponseEntity<CepBrasilApiResponseDTO> response = restTemplate.exchange(builder.buildAndExpand(cep).toUriString(),
                HttpMethod.GET,null, CepBrasilApiResponseDTO.class);

        return response.getBody();
    }


}
