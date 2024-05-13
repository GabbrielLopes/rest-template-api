package com.gabbriellps.resttemplate.api.service.interfaces;

import com.gabbriellps.resttemplate.api.dto.CepBrasilApiResponseDTO;
import com.gabbriellps.resttemplate.api.dto.ViaCepResponseDTO;

public interface CepService {

    ViaCepResponseDTO buscaViaCep(String cep);

    CepBrasilApiResponseDTO buscaBrasilApi(String cep);

}
