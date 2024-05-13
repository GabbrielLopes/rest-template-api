package com.gabbriellps.resttemplate.api.service.interfaces;

import com.gabbriellps.resttemplate.api.dto.request.VeiculoRequestDTO;
import com.gabbriellps.resttemplate.api.dto.response.VeiculoResponseDTO;

import java.util.List;

public interface CrudCrudApiService {

    void insereVeiculo(VeiculoRequestDTO requestDTO);

    List<VeiculoResponseDTO> buscaVeiculos();

    VeiculoResponseDTO buscaVeiculo(String id);

    void editaVeiculo(String id, VeiculoRequestDTO requestDTO);

    void deletaVeiculo(String id);

}
