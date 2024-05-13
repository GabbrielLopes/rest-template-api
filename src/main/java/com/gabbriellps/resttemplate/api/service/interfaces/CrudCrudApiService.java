package com.gabbriellps.resttemplate.api.service.interfaces;

import com.gabbriellps.resttemplate.api.dto.request.VeiculoDTO;

import java.util.List;

public interface CrudCrudApiService {

    void insereVeiculo(VeiculoDTO requestDTO);

    List<VeiculoDTO> buscaVeiculos();

}
