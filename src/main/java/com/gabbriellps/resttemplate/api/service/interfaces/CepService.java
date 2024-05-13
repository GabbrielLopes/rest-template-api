package com.gabbriellps.resttemplate.api.service.interfaces;

import com.gabbriellps.resttemplate.api.dto.response.CepBrasilApiResponseDTO;
import com.gabbriellps.resttemplate.api.dto.response.ViaCepResponseDTO;

public interface CepService {

    ViaCepResponseDTO buscaViaCep(String cep);

    CepBrasilApiResponseDTO buscaBrasilApi(String cep);

}
