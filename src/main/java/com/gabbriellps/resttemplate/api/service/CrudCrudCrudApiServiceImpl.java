package com.gabbriellps.resttemplate.api.service;

import com.gabbriellps.resttemplate.api.client.CrudCrudApiClient;
import com.gabbriellps.resttemplate.api.dto.request.VeiculoDTO;
import com.gabbriellps.resttemplate.api.service.interfaces.CrudCrudApiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudCrudCrudApiServiceImpl implements CrudCrudApiService {

    private final CrudCrudApiClient client;

    public CrudCrudCrudApiServiceImpl(CrudCrudApiClient client) {
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
}
