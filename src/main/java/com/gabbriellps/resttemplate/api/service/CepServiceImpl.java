package com.gabbriellps.resttemplate.api.service;

import com.gabbriellps.resttemplate.api.client.CepClient;
import com.gabbriellps.resttemplate.api.dto.CepBrasilApiResponseDTO;
import com.gabbriellps.resttemplate.api.dto.ViaCepResponseDTO;
import com.gabbriellps.resttemplate.api.service.interfaces.CepService;
import org.springframework.stereotype.Service;

@Service
public class CepServiceImpl implements CepService {

    private final transient CepClient client;

    public CepServiceImpl(CepClient client) {
        this.client = client;
    }

    @Override
    public ViaCepResponseDTO buscaViaCep(String cep) {
        return client.buscaViaCep(cep);
    }

    @Override
    public CepBrasilApiResponseDTO buscaBrasilApi(String cep) {
        return client.buscaBrasilApi(cep);
    }
}
