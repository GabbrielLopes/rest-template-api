package com.gabbriellps.resttemplate.api.service;

import com.gabbriellps.resttemplate.api.client.VeiculoCrudApiClient;
import com.gabbriellps.resttemplate.api.dto.request.VeiculoRequestDTO;
import com.gabbriellps.resttemplate.api.dto.response.VeiculoResponseDTO;
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
    public void insereVeiculo(VeiculoRequestDTO requestDTO) {
        client.insereVeiculo(requestDTO);
    }

    @Override
    public List<VeiculoResponseDTO> buscaVeiculos() {
        return client.buscaVeiculos();
    }

    @Override
    public VeiculoResponseDTO buscaVeiculo(String id) {
        return client.buscaVeiculo(id);
    }

    @Override
    public void editaVeiculo(String id, VeiculoRequestDTO requestDTO) {
        client.editaVeiculo(id, requestDTO);
    }

    @Override
    public void deletaVeiculo(String id) {
        client.deletaVeiculo(id);
    }

}
