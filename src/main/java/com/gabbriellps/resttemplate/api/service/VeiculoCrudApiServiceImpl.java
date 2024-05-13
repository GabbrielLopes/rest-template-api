package com.gabbriellps.resttemplate.api.service;

import com.gabbriellps.resttemplate.api.client.VeiculoCrudApiClient;
import com.gabbriellps.resttemplate.api.dto.request.VeiculoDTO;
import com.gabbriellps.resttemplate.api.service.interfaces.CrudCrudApiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoCrudApiServiceImpl implements CrudCrudApiService {

    private final VeiculoCrudApiClient client;

    public VeiculoCrudApiServiceImpl(VeiculoCrudApiClient client) {
        this.client = client;
    }

    @Override
    public void insereVeiculo(VeiculoDTO requestDTO) {
        client.insereVeiculo(requestDTO);
    }

    @Override
    public List<VeiculoDTO> buscaVeiculos() {
        return client.buscaVeiculos();
    }

    @Override
    public VeiculoDTO buscaVeiculo(String id) {
        return client.buscaVeiculo(id);
    }
}
